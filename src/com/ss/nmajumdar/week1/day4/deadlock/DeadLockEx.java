package com.ss.nmajumdar.week1.day4.deadlock;

import com.ss.nmajumdar.week1.day2.shapes.Rectangle;
import com.ss.nmajumdar.week1.day2.shapes.Shape;
import com.ss.nmajumdar.week1.day2.shapes.Triangle;

/**
 * @author Neil Majumdar
 */
public class DeadLockEx {

    public static void main(String[] args)
    {
        Shape s1 = new Triangle(4,5);
        Shape s2 = new Rectangle(2, 3);

        System.out.println("Start program");



        Runnable t1 = new Runnable() {

            @Override
            public void run() {
                try{
                    synchronized (s1){
                        Thread.sleep(100);
                        synchronized (s2){
                            System.out.println("Thread 1 is running");
                            s2.display();
                        }
                    }

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        Runnable t2 = new Runnable() {

            @Override
            public void run() {
                try{
                    synchronized (s2){
                        Thread.sleep(100);
                        synchronized (s1){
                            System.out.println("Thread 2 is running");
                            s1.display();
                        }
                    }

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();
        System.out.println("End of program");
    }


}
