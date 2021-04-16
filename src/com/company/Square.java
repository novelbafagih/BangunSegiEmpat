package com.company;

public class Square extends Rectangle{
    private double side;
    public Square(Point[] points, Point centerPoint) {
        super(points,centerPoint);
        side = sides[0];
    }

    @Override
    protected void calculateArea(){
        area = side * side;
    }

}
