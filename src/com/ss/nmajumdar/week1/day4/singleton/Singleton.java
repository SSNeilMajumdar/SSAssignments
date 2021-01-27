package com.ss.nmajumdar.week1.day4.singleton;

import com.ss.nmajumdar.week1.finalassignment.singleton.SampleSingleton;

/**
 * @author Neil Majumdar
 */
public class Singleton {

    volatile private static Singleton instance = null;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(instance != null) {
            synchronized (instance) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        else
            instance = new Singleton();
        return instance;
    }
}
