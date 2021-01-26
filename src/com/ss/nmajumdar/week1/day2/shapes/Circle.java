package com.ss.nmajumdar.week1.day2.shapes;

/**
 * @author Neil Majumdar
 */
public class Circle implements Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void display()
    {
       System.out.println("Area of circle with radius " + radius + " is " + calculateArea());
    }
}
