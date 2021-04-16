package com.company;

public class Main {

    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(0,0);
        points[1] = new Point(0,2);
        points[2] = new Point(2,0);
        points[3] = new Point(2,2);
        Square square = new Square(points,null);
        square.showSides();
    }
}
