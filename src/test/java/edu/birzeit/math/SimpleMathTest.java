package edu.birzeit.math;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class SimpleMathTest extends TestCase {

    static SimpleMath simpleMath;

    @BeforeClass
    public static void initCalculator() {
        simpleMath= new SimpleMath();
    }

    @Test
    public void testSum_lena() {

        int result = simpleMath.add_lena(10, 10);
        assertEquals(20, result);

    }

    @Test
    public void testSumIntegerDouble_lena() {

        @SuppressWarnings("static-access")
        Double result =  simpleMath.add_lena(10.5, 10.5);
        assertEquals(21.0, result);

    }

    @Test
    public void testMultiply_lena() {

        int result = simpleMath.multiply_lena(0, 10);
        assertEquals(0, result);

    }

    @Test
    public void testSubtract_lena() {

        int result = simpleMath.subtract_lena(-10, -10);
        assertEquals(0, result);

    }

    @Test
    public void testMultiplyDouble_lena() {

        @SuppressWarnings("static-access")
        Double result =  simpleMath.multiply_lena(10.5, 10.5);
        assertEquals(110.25, result);

    }
    @Test
    public void testDivide_lena() {

        int result = simpleMath.divide_lena(10, 10);
        assertEquals(1, result);

    }

    @Test
    public void testdividDouble_lena() {

        @SuppressWarnings("static-access")
        Double result =  simpleMath.divide_lena(10.0,1.0);
        assertEquals(10.0, result);

    }

}