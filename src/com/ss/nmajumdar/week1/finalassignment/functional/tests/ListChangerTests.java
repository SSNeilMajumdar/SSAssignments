package com.ss.nmajumdar.week1.finalassignment.functional.tests;

import com.ss.nmajumdar.week1.finalassignment.functional.ListChanger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Neil Majumdar
 */
public class ListChangerTests {

    //initialize ListChanger object and input lists
    private ListChanger changer = new ListChanger();
    private List<Integer> ints = new ArrayList<>(Arrays.asList(16, 8, 886, 11, 100007));
    private List<Integer> ints2 = new ArrayList<>(Arrays.asList(28, 119, 1097, 0, 10));
    private List<String> strings = new ArrayList<>(Arrays.asList("xxax", "xbxbxcaxx", "xxcx"));
    private List<String> strings2 = new ArrayList<>(Arrays.asList("axxxbc", "xabx", "xxcxf"));


    @Test
    public void testRightDigit()
    {

        List<Integer> rightDigits = changer.rightDigit(ints);
        assertEquals(Arrays.asList(6, 8, 6, 1, 7), rightDigits);

        List<Integer> rightDigits2 = changer.rightDigit(ints2);
        assertNotEquals(Arrays.asList(8, 9, 7, 0, 1), rightDigits2);
    }

    @Test
    public void testDoubleNumbers()
    {
        List<Integer> doubleNums = changer.doubleNumbers(ints);
        assertEquals(Arrays.asList(32, 16, 1772, 22, 200014), doubleNums);

        List<Integer> doubleNums2 = changer.doubleNumbers(ints2);
        assertNotEquals(Arrays.asList(56, 239, 2194, 0, 20), doubleNums2);
    }

    @Test
    public void testRemoveXs()
    {
        List<String> xFreeStrings = changer.removeXs(strings);
        assertEquals(Arrays.asList("a", "bbca", "c"), xFreeStrings);

        List<String> xFreeStrings2 = changer.removeXs(strings2);
        assertNotEquals(Arrays.asList("ab", "ab", "cf"), xFreeStrings2);

        List<String> xFreeStrings3 = changer.removeXs(Arrays.asList("x"));
        assertEquals(Arrays.asList(""), xFreeStrings3);
    }
}
