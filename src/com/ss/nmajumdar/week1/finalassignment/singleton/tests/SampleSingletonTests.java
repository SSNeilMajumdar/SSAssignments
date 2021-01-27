package com.ss.nmajumdar.week1.finalassignment.singleton.tests;

import com.ss.nmajumdar.week1.finalassignment.singleton.SampleSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SampleSingletonTests {

    @Test
    public void testSampleSingleton()
    {
        SampleSingleton singleton = SampleSingleton.getInstance();
        assertNotEquals(null, singleton);

        SampleSingleton singleton1 = SampleSingleton.getInstance();
        assertEquals(singleton, singleton1);
    }
}
