package jdk;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultithreadingSnippet {
    public static void main(final String[] args) throws InterruptedException, ExecutionException {
        complete();
    }

    private static void normal() throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final List<Callable<Integer>> jobs = ImmutableList.of(
                new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("Start 1");
                        Thread.sleep(1000L);
                        System.out.println("End 1");
                        return 1;
                    }
                },
                new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("Start 2");
                        System.out.println("End 2");
                        return 2;
                    }
                },
                new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("Start 3");
                        Thread.sleep(5000L);
                        System.out.println("End 3");
                        return 3;
                    }
                }
        );
/*        final List<Future<Integer>> futures = executorService.invokeAll(jobs);

        for (final Future<Integer> future : futures) {
            try {
                final Integer result = future.get();
                System.out.println(result);
            } catch (final ExecutionException e) {
                e.printStackTrace();
            }
        }*/

        final List<Future<Integer>> futures_v2 = new ArrayList<>();

        for (int i = 0; i < 3; i ++) {
            futures_v2.add(executorService.submit(jobs.get(i)));
        }

        try {
            final Integer result = futures_v2.get(0).get();
            System.out.println(result);
        } catch (final ExecutionException e) {
            e.printStackTrace();
        }

        for (final Future<Integer> future : futures_v2) {
            try {
                final Integer result = future.get();
                System.out.println(result);
            } catch (final ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }

    private static void complete() throws InterruptedException, ExecutionException {
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        final ExecutorCompletionService<Integer> service = new ExecutorCompletionService<>(executorService);
        for (int i = 0; i < 5; i++ ) {
            final int val = i;
            service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep((5 - val) * 1000);
                    return val;
                }
            });
        }

        for (int i = 0; i < 5; i++) {
            final Future<Integer> future = service.take();

            final Integer result = future.get();
            System.out.println(result);
        }

        System.out.println(executorService.isTerminated());
        executorService.shutdown();


    }
}
