package guava.concurrency;

import com.google.common.base.Function;
import com.google.common.util.concurrent.*;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * https://github.com/google/guava/wiki/ListenableFutureExplained
 *
 * We strongly advise that you always use ListenableFuture instead of Future in all of your code
 *
 * Avoid nested Futures
 */
public class ListenableFutureExplained {

    public static void main(final String[] args) {
        final ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
        final ListenableFuture<Integer> future = service.submit(() -> {
            Thread.sleep(5000L);
            return 1;
        });
        final List<Integer> list = new ArrayList<>();
        Futures.addCallback(future, new FutureCallback<Integer>() {
            @Override
            public void onSuccess(@Nullable Integer result) {
                list.add(result);
                System.out.println(result);
            }

            @Override
            public void onFailure(final Throwable t) {
                System.out.println("It's failing");
                t.printStackTrace();
            }
        }, service);
        System.out.println("Reach the end");
        System.out.println(list);

        ListenableFuture<String> submit = service.submit(() -> {
            Thread.sleep(10000L);
            return "sdf";
        });
        ListenableFuture<Integer> transform = Futures.transform(submit, new Function<String, Integer>() {
            @Nullable
            @Override
            public Integer apply(@Nullable String input) {
                return input.length();
            }
        }, service);
        Futures.addCallback(transform, new FutureCallback<Integer>() {
            @Override
            public void onSuccess(@Nullable Integer result) {
                System.out.println("My number is " + result);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        }, service);
    }
}
