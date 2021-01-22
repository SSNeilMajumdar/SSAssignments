package com.ss.nmajumdar.day2.shapes;

/**
 * @author Neil Majumdar
 */
public class Test
{
    public static void main(String[] args)
    {
        //initialize shapes
        Rectangle rect = new Rectangle(4, 9);
        Triangle triangle = new Triangle(4, 5);
        Circle circle = new Circle(4);

        //display areas
        rect.display();
        triangle.display();
        circle.display();
    }
}
