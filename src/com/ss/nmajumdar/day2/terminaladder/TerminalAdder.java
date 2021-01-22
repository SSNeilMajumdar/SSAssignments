package com.ss.nmajumdar.day2.terminaladder;

/**
 * @author Neil Majumdar
 */
public class TerminalAdder {

    public static void main(String[] args)
    {
        if(args.length > 0)
        {
            double[] nums = new double[args.length];
            try
            {
                //converts string args array into double array
                for(int i = 0; i < args.length; i++)
                    nums[i] = Double.valueOf(args[i]);
                System.out.println(getSum(nums));
            }
            catch(NumberFormatException e)
            {
                System.err.println("One or more arguments are not numbers");
            }
            catch (NullPointerException e)
            {
                System.err.println("Array is null");
            }
        }
        else
            System.err.println("No arguments provided for addition");
    }

    /**
     *
     * @param nums array of doubles
     * @return sum of array values
     * @throws NullPointerException
     */
    public static double getSum(double[] nums) throws NullPointerException
    {
        double sum = 0;
        for(Double num : nums)
            sum += num;

        return sum;

    }

}
