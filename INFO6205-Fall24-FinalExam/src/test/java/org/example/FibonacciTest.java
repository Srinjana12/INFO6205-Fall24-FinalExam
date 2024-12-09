package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    @Timeout(value = 1)
    void Zero() {
        assertEquals(0, new Fibonacci().fibN(0));
    }

    @Test
    @Timeout(value = 1)
    void One() {
        assertEquals(1, new Fibonacci().fibN(1));
    }

    @Test
    @Timeout(value = 1)
    void Two() {
        assertEquals(1, new Fibonacci().fibN(2));
    }

    @Test
    @Timeout(value = 1)
    void Twenty() {
        assertEquals(6765, new Fibonacci().fibN(20));
    }

    @Test
    @Timeout(value = 1)
    void isMemoized() {
        assertEquals(12586269025L, new Fibonacci().fibN(50));
    }

    @Test
    @Timeout(value = 1)
    void isMemoized2() {
        assertEquals(7540113804746346429L, new Fibonacci().fibN(92));
    }

    @Test
    @Timeout(value = 1)
    void fail0() {
        assertEquals(-1L, new Fibonacci().fibN(-1));
    }

    @Test
    @Timeout(value = 1)
    void fail1() {
        assertEquals(-1L, new Fibonacci().fibN(93));
    }

    @Test
    @Timeout(value = 1)
    void testSum() {
        Random random = new Random();
        int r = random.nextInt(91);
        Fibonacci fibonacci = new Fibonacci();
        long l = fibonacci.sumN(r);
        assertEquals(fibonacci.fibN(r + 2) - 1, l);
    }
}