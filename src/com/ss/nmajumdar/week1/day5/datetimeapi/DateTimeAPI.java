package com.ss.nmajumdar.week1.day5.datetimeapi;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Neil Majumdar
 */
public class DateTimeAPI {

    /**
     * Questions 5-7 about Date-Time API
     * @param args
     */
    public static void main(String[] args)
    {
        //5)
        int year = 2021;
        int[] monthLengths = getMonthLengths(year);
        for(int i = 0; i < 12; i++)
            System.out.println("Days in " + getMonth(i + 1) + ", " + year + ": " + monthLengths[i]);
        System.out.println();

        //6)
        printMondays(Month.JANUARY);
        System.out.println();

        //7)
        try{
            LocalDate date = Year.now().atMonth(Month.AUGUST).atDay(13);
            LocalDate date1 = Year.now().atMonth(Month.SEPTEMBER).atDay(13);
            if(onFridayThirteenth(date))
                System.out.println(date + " is Friday the 13th");
            if(!onFridayThirteenth(date1))
                System.out.println(date + " is not Friday the 13th");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }






    }

    /**
     *
     * @param year
     * @return lengths of each month in year
     */
    public static int[] getMonthLengths(int year)
    {
        int[] monthLengths = new int[12];
        int i = 0;
        try {
            Year year1 = Year.of(year);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        for(Month month : Month.values())
        {
            YearMonth ym = YearMonth.of(year, month);
            monthLengths[i] = ym.lengthOfMonth();
            i++;
        }

        return monthLengths;
    }


    /**
     * gets month name from month number
     * @param monthNum
     * @return month name as a string
     */
    private static String getMonth(int monthNum)
    {
        switch (monthNum)
        {
            case 1 : return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";

        }
        return "Not a month";
    }

    /**
     * print Mondays from month
     * @param month
     */
    public static void printMondays(Month month)
    {
        LocalDate date = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month m = date.getMonth();
        while(m == month) {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            m = date.getMonth();
        }
    }

    /**
     * checks if data is on Friday the 13th
     * @param date
     * @return
     */
    public static boolean onFridayThirteenth(LocalDate date)
    {
        return (date.getDayOfMonth() == 13) && (date.getDayOfWeek() == DayOfWeek.FRIDAY);
    }
}
