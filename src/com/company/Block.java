package com.company;

public class Block extends Rectangle{
    private double height;

    public Block(Point[] points, Point centerPoint,double height) {
        super(points,centerPoint);
        this.height = height;
    }

    @Override
    protected void calculateArea() {
        area = 2*height*length + 2*length*width + 2*height*width;
    }
}