package com.ss.nmajumdar.week1.finalassignment.lambdas;

import java.util.function.Function;

/**
 * @author Neil Majumdar
 */
public class Lambdas {

    /**
     * determines if number is even or odd
     * @return lambda
     */
    public Function<Integer, String> isOdd()
    {
        return (num) -> {
            if(num % 2 == 0)
                return "EVEN";
            return "ODD";
        };
    }

    /**
     * determines if number is prime or composite
     * @return lambda
     */
    public Function<Integer, String> isPrime()
    {
        return (num) -> {
            for(int i = 2; i <= num/2; i++)
            {
                if((num % i) == 0)
                    return "COMPOSITE";
            }

            return "PRIME";
        };
    }

    /**
     * determines if number is a palindrome
     * @return lambda
     */
    public Function<Integer, String> isPalindrome()
    {
        return (num) -> {
          String str = String.valueOf(num);
          StringBuffer buffer = new StringBuffer();
          for(int i = str.length() - 1; i >= 0; i--)
              buffer.append(str.charAt(i));
          String reverseStr = new String(buffer);

          if(str.equals(reverseStr))
              return "PALINDROME";
          return "NOT A PALINDROME";
        };
    }
}
