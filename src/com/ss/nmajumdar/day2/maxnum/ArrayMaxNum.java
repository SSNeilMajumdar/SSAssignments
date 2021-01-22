package com.ss.nmajumdar.day2.maxnum;

/**
 * @author Neil Majumdar
 */
public class ArrayMaxNum
{
    public static void main(String[] args)
    {
        double[][] arr = generateArray();
        int[] maxPos = getMaxPosition(arr);
        int maxRow = maxPos[0];
        int maxCol = maxPos[1];
        double maxNum = getNumByPos(arr, maxRow, maxCol);
        System.out.println("Max number in array is " + maxNum + " at position:(" + maxRow + ", " + maxCol + ")");
    }

    /**
     * generates hard coded 2 dimensional array
     * @return hard coded array
     */
    public static double[][] generateArray()
    {
        double[][] arr = {
                {1, 2, 3, 4, 5, 5000},
                {6, 7, 8, 9, 10, 11},
                {11, 12, 13, 14, 15, 14},
                {16, 17, 18, 191, 20, 1},
                {21, 22, 25, 24, 231, 0}
        };

        return arr;
    }

    /**
     *
     * @param arr 2 dimensional array
     * @return position of the max number
     */
    public static int[] getMaxPosition(double[][] arr)
    {
        double maxNum = Double.MIN_VALUE;
        double num = 0;
        int[] maxPos = new int[2];
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[0].length; col++)
            {
                num = arr[row][col];
                if(num > maxNum)
                {
                    maxNum = num;
                    maxPos[0] = row;
                    maxPos[1] = col;
                }
            }
        }

        return maxPos;
    }

    /**
     *
     * @param arr 2 dimensional array
     * @param row row index of array
     * @param col col index of array
     * @return value at position arr[row][col]
     */
    public static double getNumByPos(double[][] arr,int row, int col)
    {
        return arr[row][col];
    }
}


