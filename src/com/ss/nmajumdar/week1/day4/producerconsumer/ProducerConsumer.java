package com.ss.nmajumdar.week1.day4.producerconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Majumdar
 */
public class ProducerConsumer {

    volatile private static List<Integer> items = new ArrayList<>();

    public static void main(String[] args)
    {
        Runnable producer = new Runnable() {

            @Override
            public void run() {
                try {
                    System.out.println("100 productions begin");
                    for (int i = 0; i < 100; i++) {
                        while (items.size() >= 10) ;
                        synchronized (items) {
                            items.add((int) (Math.random() * 100) + 1);
                        }
                    }
                    System.out.println("100 productions end");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        };

        Runnable consumer = new Runnable() {

            @Override
            public void run() {
                try {

                    System.out.println("100 consumptions begin");
                    for (int i = 0; i < 100; i++) {
                        while (items.size() <= 0);
                        synchronized (items) {
                            items.remove(items.size() - 1);
                        }

                    }
                    System.out.println("100 consumptions end");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
