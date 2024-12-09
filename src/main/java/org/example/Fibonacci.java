package org.example;

public class Fibonacci {

    /**
     * Return the <code>n</code>th Fibonacci number.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and
     *          less than 93.
     * @return if <code>n</code> < 0 or <code>n</code> > 92 then -1;
     *         else if <code>n</code> < 2 then <code>n</code>;
     *         else <code>fibN(n-1)</code> + <code>fibN(n-2)</code>.
     */
    public long fibN(int n) {
        if (n < 0 || n > 92) {
            return -1L;
        }
        if (n < 2) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibN(n - 1) + fibN(n - 2);
        return memo[n];
    }

    /**
     * Determine the sum of the first <code>n</code> Fibonacci numbers.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and
     *          less than 93.
     * @return the sum of the Fibonacci numbers 0 through n.
     */
    public long sumN(int n) {
        if (n < 0 || n > 92) {
            return -1L;
        }
        return fibN(n + 2) - 1;
    }

    public Fibonacci() {

        memo[0] = 0;
        memo[1] = 1;
    }

    private final long[] memo = new long[93];
}

// push the code again