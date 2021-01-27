package com.ss.nmajumdar.week1.finalassignment.lambdas.tests;

import com.ss.nmajumdar.week1.finalassignment.lambdas.Lambdas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Neil Majumdar
 */
public class LambdasTest {

    private Lambdas lambdas = new Lambdas();

    @Test
    public void testIsOdd()
    {
        assertEquals("ODD", lambdas.isOdd().apply(3));
        assertEquals("EVEN", lambdas.isOdd().apply(100));

        assertNotEquals("ODD", lambdas.isOdd().apply(16));
        assertNotEquals("EVEN", lambdas.isOdd().apply(201));
    }

    @Test
    public void testIsPrime()
    {
        assertEquals("PRIME", lambdas.isPrime().apply(13));
        assertEquals("COMPOSITE", lambdas.isPrime().apply(75));

        assertNotEquals("PRIME", lambdas.isPrime().apply(9));
        assertNotEquals("COMPOSITE", lambdas.isPrime().apply(2));
    }

    @Test
    public void testIsPalindrome()
    {
        assertEquals("PALINDROME", lambdas.isPalindrome().apply(3127213));
        assertEquals("NOT A PALINDROME", lambdas.isPalindrome().apply(123322));

        assertNotEquals("PALINDROME", lambdas.isPalindrome().apply(1223));
        assertNotEquals("NOT A PALINDROME", lambdas.isPalindrome().apply(123321));
    }
}
