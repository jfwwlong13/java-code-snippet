package hadoop;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.CombineTextInputFormat;

import java.io.IOException;

public class mapreduce {

    public static void main(final String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        JobConf jobConf = new JobConf();

        //jobConf.setJarByClass(mapreduce.class);
        jobConf.setJar("/home/jianfu/github/java-code-snippet/build/libs/java-code-snippet.jar");
        jobConf.setJobName("Word count");
        jobConf.set("mapreduce.input.fileinputformat.split.minsize", "102400");



        FileOutputFormat.setOutputPath(jobConf, new Path("/wordcount_dir3.txt"));

        final Job job = Job.getInstance(jobConf);
        CombineTextInputFormat.addInputPath(job, new Path("/input"));
        job.setInputFormatClass(CombineTextInputFormat.class);
        job.setMapperClass(MapperWordCount.class);
        job.setReducerClass(ReduceWordCount.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

    public static class MapperWordCount extends Mapper<LongWritable, Text, Text, IntWritable> {

        @Override
        public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            context.write(value, new IntWritable(1));
        }
    }

    public static class ReduceWordCount extends Reducer<Text, IntWritable, Text, IntWritable> {

        @Override
        public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
            int count = 0;
            for (final IntWritable value : values) {
                count += value.get();
            }

            context.write(key, new IntWritable(count));
        }
    }
}
