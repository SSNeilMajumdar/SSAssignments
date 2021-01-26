package com.ss.nmajumdar.week1.day5.evenodd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Neil Majumdar
 */
public class EvenOddString {

    public static void main(String[] args)
    {
        List<Integer> ints = Arrays.asList(3, 44, 55, 101, 200);
        System.out.println(getEvenOddString(ints));
    }

    /**
     * even integers are preceded by 'e'
     * odd integers are preceded by 'o
     * @param ints input list
     * @return comma separated string from input list
     */
    public static String getEvenOddString(List<Integer> ints)
    {
        Stream<Integer> intStream = ints.stream();
        Stream<String> strStream = intStream.map(num -> {
            if(num % 2 == 0)
                return 'e' + String.valueOf(num);
            return 'o' + String.valueOf(num);
        });


        return strStream.collect(Collectors.joining(","));


    }


}
