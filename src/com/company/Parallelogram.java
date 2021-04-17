package com.company;

public class Parallelogram extends Rectangle{
    private double base;
    public Parallelogram(Point[] points, Point centerPoint) {
        super(points,centerPoint);
        base = sides[0];
    }

    @Override
    protected void calculateArea() {
        area = base * tallnes;
    }
}
