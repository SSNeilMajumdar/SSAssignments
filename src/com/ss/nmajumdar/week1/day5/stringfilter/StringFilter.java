package com.ss.nmajumdar.week1.day5.stringfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Neil Majumdar
 */
public class StringFilter
{
    public static void main(String[] args)
    {
        //initialize input list
        List<String> strings = Arrays.asList("apple", "ace", "ac1", "bob", "alphabet", "act", "Act", "app");

        //print input list
        System.out.println("Input List");
        System.out.println("----------");
        for(String string : strings)
            System.out.println(string);
        System.out.println();

        //filter input list
        List<String> filterList = filterStrings(strings);

        //print filtered list
        System.out.println("Filtered List");
        System.out.println("----------");
        for(String string : filterList)
            System.out.println(string);




    }

    /**
     * returns list of strings with first character 'a', length 3, only letters
     * @param strings input list
     * @return filtered list
     */
    public static List<String> filterStrings(List<String> strings)
    {
        Stream<String> strStream = strings.parallelStream();
        Stream<String> strFilterStream = strStream.filter(str -> (str.charAt(0) == 'a' && str.length() == 3) && onlyLetters(str));
        return strFilterStream.collect(Collectors.toList());

    }

    /**
     *
     * @param str input string
     * @return if string contains only letters
     */
    public static boolean onlyLetters(String str)
    {
        return !(str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4")
                || str.contains("5") || str.contains("6") || str.contains("7")
                || str.contains("8") || str.contains("9"));

    }


}
