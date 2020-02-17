package ch.pitbula.codewars.kyu_3;import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheMillionthFibonacciTest {

    @Test
    public void testFib0() {
        testFib(0, 0);
    }

    @Test
    public void testFib1() {
        testFib(1, 1);
    }

    @Test
    public void testFib2() {
        testFib(1, 2);
    }

    @Test
    public void testFib3() {
        testFib(2, 3);
    }

    @Test
    public void testFib4() {
        testFib(3, 4);
    }

    @Test
    public void testFib5() {
        testFib(5, 5);
    }

    @Test
    public void testFib6() {
        testFib(8, 6);
    }

    @Test
    public void testFib90() {
        testFib(2880067194370816120l, 90);
    }

    @Test
    public void testFibMinus1() {
        testFib(2880067194370816120l, -1);
    }


    private static void testFib(long expected, long input) {
        BigInteger found;
        try {
            found = TheMillionthFibonacci.fib(BigInteger.valueOf(input));
        }
        catch (Throwable e) {
            // see https://github.com/Codewars/codewars.com/issues/21
            throw new AssertionError("exception during test: "+e, e);
        }
        assertEquals(BigInteger.valueOf(expected), found);
    }
}
