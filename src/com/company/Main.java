package com.company;

public class Main {

    public static void main(String[] args) {
        //Rectangle
        Point[] points = new Point[4];
        points[0] = new Point(0,0);
        points[1] = new Point(0,2);
        points[2] = new Point(2,0);
        points[3] = new Point(2,2);
        Square square = new Square(points,null);
        square.showSides();
        System.out.println();

        points[0] = new Point(0,0);
        points[1] = new Point(3,4);
        points[2] = new Point(13,4);
        points[3] = new Point(16,0);
        Rectangular trapezoid = new Rectangular(points,null);
        System.out.println();

        points[0] = new Point(0,0);
        points[1] = new Point(4,3);
        points[2] = new Point(4,13);
        points[3] = new Point(0,16);
        Rectangular trapezoidMiring = new Rectangular(points,null);
        trapezoidMiring.showSides();
    }
}
