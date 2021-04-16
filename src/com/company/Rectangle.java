package com.company;

public class Rectangle extends Rectangular{
    protected double length;
    protected double width;

    public Rectangle(Point[] points, Point centerPoint) {
        super(points,centerPoint);
        length = sides[0];
        width = sides[3];
    }

    @Override
    protected void calculateArea(){
        area = length * width;
    }

}
