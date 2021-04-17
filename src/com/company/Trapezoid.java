package com.company;

public class Trapezoid extends Rectangular{
    private final double base1;
    private final double base2;

    public Trapezoid(Point[] points, Point centerPoint){
        super(points,centerPoint);
        base1 = sides[0];
        base2 = sides[1];
    }

    @Override
    protected void calculateArea() {
        area = (base1+base2)*tallnes/2.0;
    }
}
