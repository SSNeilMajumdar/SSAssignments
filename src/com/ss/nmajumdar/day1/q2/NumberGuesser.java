package com.ss.nmajumdar.day1.q2;

import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        int randNum = (int)(Math.random() * 100) + 1;
        System.out.println(randNum);
        for(int i = 0; i < 5; i++) {
            System.out.print("Guess a number within 10 of a number between 1 and 100. You have ");
            System.out.print(5 - i);
            System.out.println(" tries remaining: ");
            number = sc.nextInt();
            if((number >= randNum - 10) && (number <= randNum + 10))
            {
                System.out.println("Correct. The number was " + randNum);
                return;
            }

        }

        System.out.println("Sorry. The number was " + randNum);
    }
}
