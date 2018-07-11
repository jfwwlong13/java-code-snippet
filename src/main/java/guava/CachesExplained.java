package guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * https://github.com/google/guava/wiki/CachesExplained
 *
 * Cache.get(K, Callable<V>) should always be preferred over Cache.asMap().putIfAbsent
 *
 * For test, you can use Ticker class
 */
public class CachesExplained {
    private static int i = 0;

    public static void main(final String[] args) throws ExecutionException, InterruptedException {
        final LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .maximumSize(5)
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .refreshAfterWrite(1, TimeUnit.SECONDS)
                .recordStats()
                .build(new CacheLoader<String, Integer>() {
                           @Override
                           public Integer load(final String key) {
                               i++;
                               return key.length() + i - 1;
                           }
                       }
                );

        System.out.println(cache.get("sdf"));
        System.out.println(cache.asMap());
        System.out.println(cache.get("asdf"));
        System.out.println(cache.asMap());
        Thread.sleep(6000L);
        System.out.println(cache.asMap());
        System.out.println(cache.getIfPresent("asdf"));

        System.out.println(cache.get("qwer", () -> "qwer".length() + 1));
        System.out.println(cache.getIfPresent("qwer"));
        cache.put("jianfu", 111);
        System.out.println(cache.asMap());

        System.out.println(cache.stats());
    }
}
