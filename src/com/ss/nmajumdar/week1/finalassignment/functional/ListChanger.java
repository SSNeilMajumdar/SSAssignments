package com.ss.nmajumdar.week1.finalassignment.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Neil Majumdar
 */
public class ListChanger {

    /**
     *
     * @param ints input list
     * @return list of right digits of input list
     */
    public List<Integer> rightDigit(List<Integer> ints)
    {
        Stream<Integer> intStream = ints.stream();
        Stream<Integer> rightDigitStream = intStream.map((num) -> num % 10);
        return rightDigitStream.collect(Collectors.toList());
    }


    /**
     *
     * @param ints input list
     * @return list of input list numbers doubled
     */
    public List<Integer> doubleNumbers(List<Integer> ints)
    {
        Stream<Integer> intStream = ints.stream();
        Stream<Integer> rightDigitStream = intStream.map((num) -> num * 2);
        return rightDigitStream.collect(Collectors.toList());
    }

    /**
     *
     * @param strings input list
     * @return list of strings with x's removed
     */
    public List<String> removeXs(List<String> strings)
    {
        Stream<String> strStream = strings.stream();
        Stream<String> removeXStream = strStream.map((str) -> {
            StringBuffer buffer = new StringBuffer(str);
            int i = 0;
            while(i < buffer.length())
            {
                if(buffer.charAt(i) == 'x')
                    buffer.deleteCharAt(i);
                else
                    i++;
            }

            return new String(buffer);
        });

        return removeXStream.collect(Collectors.toList());
    }
}
