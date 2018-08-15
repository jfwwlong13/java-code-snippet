package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

import java.io.IOException;

public class hbase {

    public static void main(final String[] args) throws IOException {
        Configuration config = HBaseConfiguration.create();
        HTable table = new HTable(config, "student");

        // Instantiating the Scan class
        Scan scan = new Scan();
        ResultScanner scanner = table.getScanner(scan);

        // Reading values from scan result
        for (Result result = scanner.next(); result != null; result = scanner.next()) {

            System.out.println("Found row : " + result);
            byte[] value = result.getValue("info".getBytes(), "age".getBytes());
            System.out.println(new String(value));
        }

        scanner.close();
    }
}
