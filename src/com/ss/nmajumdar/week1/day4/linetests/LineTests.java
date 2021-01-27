package com.ss.nmajumdar.week1.day4.linetests;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Neil Majumdar
 */
public class LineTests {

    Line l1 = new Line(0, 1, 1, 7);
    Line l2 = new Line(-5, 3, 4, -8);

    @Test
    public void testGetSlope()
    {
        assertEquals(6, l1.getSlope());
        assertEquals(-1.2222222222222, l2.getSlope(), .0001);
    }

    @Test
    public void testGetDistance()
    {
        assertEquals(6.0827625302982, l1.getDistance(), .0001);
        assertEquals(14.212670403552, l2.getDistance(), .0001);
    }

    @Test
    public void testParallelTo()
    {
        assertEquals(false, l1.parallelTo(l2));
    }
}
