package com.ss.nmajumdar.week1.day5.arraysorter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Majumdar
 */
public class ArraySorter {

    public static void main(String[] args)
    {
        //initialize array and sorter object
        String[] strings = {"Rodgers", "Brady", "Roethlisberger", "Watson", "Mahomes"};
        List<String> names = Arrays.asList(strings);
        ArraySorter sorter = new ArraySorter();

        //original unsorted array
        System.out.println("Unsorted array");
        System.out.println("--------------");
        for(String name : names)
            System.out.println(name);
        System.out.println();

        //sorted by length
        sorter.sortByLength(names);
        System.out.println("Sorted by length");
        System.out.println("--------------");
        for(String name : names)
            System.out.println(name);
        System.out.println();

        //sorted by length reverse
        sorter.sortByLengthReverse(names);
        System.out.println("Sorted by length reverse");
        System.out.println("--------------");
        for(String name : names)
            System.out.println(name);
        System.out.println();

        //sorted by first character
        sorter.sortByFirstCharacter(names);
        System.out.println("Sorted by first character");
        System.out.println("--------------");
        for(String name : names)
            System.out.println(name);
        System.out.println();

        //sorted by containing e static
        sorter.sortByContainingE(names);
        System.out.println("Sorted by containing e");
        System.out.println("--------------");
        for(String name : names)
            System.out.println(name);
        System.out.println();

        //sorted by containing e static
        sorter.sortByContainingEStatic(strings);
        System.out.println("Sorted by containing e static");
        System.out.println("--------------");
        for(String name : names)
            System.out.println(name);
        System.out.println();

    }

    /**
     * sorts by length shortest to largest
     * @param strings list to be sorted
     */
    public void sortByLength(List<String> strings)
    {
        strings.sort((String str1, String str2) -> str1.length() - str2.length());
    }

    /**
     * sorts by length largest to shortest
     * @param strings list to be sorted
     */
    public void sortByLengthReverse(List<String> strings)
    {
        strings.sort((String str1, String str2) -> str2.length() - str1.length());
    }

    /**
     * sorts by first character
     * @param strings list to be sorted
     */
    public void sortByFirstCharacter(List<String> strings)
    {
        strings.sort((String str1, String str2) -> str1.charAt(0) - str2.charAt(0));
    }

    /**
     * sorts by containing e
     * @param strings list to be sorted
     */
    public void sortByContainingE(List<String> strings)
    {
        strings.sort((String str1, String str2) -> str2.indexOf('e') - str1.indexOf('e'));
    }

    /**
     * sorts by containing e statically
     * @param strings list to be sorted
     */
    public void sortByContainingEStatic(String[] strings)
    {
        Arrays.sort(strings, (String str1, String str2) -> str2.indexOf('e') - str1.indexOf('e'));
    }



}
