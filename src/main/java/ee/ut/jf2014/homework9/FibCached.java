package ee.ut.jf2014.homework9;

import java.math.BigInteger;

public class FibCached {

    //Implement this cache
    static class MyCache {

        public BigInteger get(Long n) {
            return BigInteger.ZERO;
        }

        public void put(Long n, BigInteger result) {

        }

        public long collectedCount() {
            return 0L;
        }

        public long putCount() {
            return 0L;
        }

        public long getCount() {
            return 0L;
        }

        public long hitCount() {
            return 0L;
        }
    }

    static MyCache cache = new MyCache();
    
    // this uses too much memory
    // static Map<Long, BigInteger> cache = new HashMap<Long, BigInteger>();

    public static BigInteger fib(long n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        BigInteger cached = cache.get(n);
        if (cached != null) {
            return cached;
        }

        BigInteger result = fib(n - 1).add(fib(n - 2));
        cache.put(n, result);
        return result;
    }

    public void calculate() {
        int i = 0;
        BigInteger result = null;
        for (i = 0; i < 100000; i++) {
            // long start = System.currentTimeMillis();
            result = fib(i);
            // long end = System.currentTimeMillis();
            // System.out.println(i + " " + result + " " + (end - start));
        }
        System.out.println("done");
        
        // report statistics
        System.out.println("putCount=" + cache.putCount()); // number of calls to cache put method
        System.out.println("getCount=" + cache.getCount()); // number of calls to cache get method
        System.out.println("hitCount=" + cache.hitCount()); // number of calls to cache get method that found a value from cache
        System.out.println("missCount=" + (cache.getCount() - cache.hitCount())); // number of calls to cache get method that did not find a value from cache
        System.out.println("hitRatio=" + ((double) cache.hitCount()) / cache.getCount());
        System.out.println("collectedCount=" + cache.collectedCount()); // number of elements that were put to cache and collected by gc
    }

}
