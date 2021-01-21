package com.ss.nmajumdar.day1.q1;

public class Patterns {

    private static int numDots = 9;

    public static void main(String[] args)
    {
        //print pattern 1
        System.out.println("1)");

        for(int i = 0; i < 4; i++)
            System.out.println(getConsecSymbols("*", i + 1));

        System.out.println(getConsecSymbols(".", numDots));
        System.out.println();

        //print pattern 2
        System.out.println("2)");
        System.out.println(getConsecSymbols(".", ++numDots));

        for(int i = 4; i > 0; i--)
            System.out.println(getConsecSymbols("*", i));

        System.out.println();

        //print pattern 3
        System.out.println("3)");
        int indent = 5;
        int numStars = 1;

        for(int i = 0; i < 4; i++)
        {
            System.out.print(getConsecSymbols(" ", indent));
            System.out.print(getConsecSymbols("*", numStars));
            System.out.print(getConsecSymbols(" ", indent));
            indent--;
            numStars += 2;
            System.out.println();
        }

        System.out.println(getConsecSymbols(".", ++numDots));
        System.out.println();

        //print pattern 4
        System.out.println("4)");
        System.out.println(getConsecSymbols(".", ++numDots));
        indent = 2;
        numStars = 7;

        for(int i = 0; i < 4; i++)
        {
            System.out.print(getConsecSymbols(" ", indent));
            System.out.print(getConsecSymbols("*", numStars));
            System.out.print(getConsecSymbols(" ", indent + 1));
            indent++;
            numStars -= 2;
            System.out.println();
        }



    }

    //returns string of symbols, length of string is equal to frequency
    public static String getConsecSymbols(String symbol, int frequency)
    {
        String symbols = "";
        for(int i = 0; i < frequency; i++)
            symbols += symbol;

        return symbols;

    }
}
