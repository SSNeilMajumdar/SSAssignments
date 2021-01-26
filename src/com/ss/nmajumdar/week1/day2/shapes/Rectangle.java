package com.ss.nmajumdar.week1.day2.shapes;

/**
 * @author Neil Majumdar
 */
public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;

    }

    @Override
    public double calculateArea()
    {
        return length * width;
    }

    @Override
    public void display()
    {
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is " + calculateArea());
    }


}
