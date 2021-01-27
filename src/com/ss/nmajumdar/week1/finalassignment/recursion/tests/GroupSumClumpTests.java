package com.ss.nmajumdar.week1.finalassignment.recursion.tests;

import com.ss.nmajumdar.week1.finalassignment.recursion.GroupSumClump;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Neil Majumdar
 */
public class GroupSumClumpTests {

    private GroupSumClump groupSumClump = new GroupSumClump();

    @Test
    public void testGroupSumClump()
    {
        assertEquals(true, groupSumClump.groupSumClump(0, Arrays.asList(1, 2, 4, 8, 1), 14));
        assertEquals(false, groupSumClump.groupSumClump(0, Arrays.asList(2, 4, 4, 8), 14));

        assertNotEquals(true, groupSumClump.groupSumClump(0, Arrays.asList(2, 3, 3, 4, 10), 9));
        assertNotEquals(false, groupSumClump.groupSumClump(0, Arrays.asList(2, 4, 8), 10));
    }
}
