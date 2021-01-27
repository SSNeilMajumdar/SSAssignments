package com.ss.nmajumdar.week1.finalassignment.recursion;

import java.util.Arrays;
import java.util.List;

public class GroupSumClump {

    public static void main(String[] args)
    {
        GroupSumClump clump = new GroupSumClump();
        System.out.println(clump.groupSumClump(0, Arrays.asList(2, 4, 4, 8), 14));
    }

    /**
     *
     * @param startIndex current index of list
     * @param ints input list
     * @param target target sum
     * @return whether target sum was met
     */
    public boolean groupSumClump(int startIndex, List<Integer> ints, int target)
    {
        //if at the end of list, check if group of nums was found to equal target
        if(startIndex >= ints.size())
            return target == 0;

        int i = startIndex;
        int sum = 0;
        
        //add one num, unless there are consecutive values that are the same
        while((i < ints.size()) && (ints.get(startIndex) == ints.get(i)))
        {
            sum += ints.get(i);
            i++;
        }
        
        //check if using sum will lead to equalling the target
        if(groupSumClump(i, ints, target - sum))
            return true;

        //check if not using sum will lead to equalling the target
        if(groupSumClump(i, ints, target))
            return true;

        //if neither work then there is not group of numbers to equal the target
        return false;
        
    }
}
