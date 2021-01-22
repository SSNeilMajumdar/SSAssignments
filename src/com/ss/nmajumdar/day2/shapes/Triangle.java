package com.ss.nmajumdar.day2.shapes;

/**
 * @author Neil Majumdar
 */
public class Triangle implements Shape
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return 0.5 * base * height;
    }

    @Override
    public void display()
    {
       System.out.println("Area of triangle with base " + base + " and height " + height + " is " + calculateArea());
    }
}
