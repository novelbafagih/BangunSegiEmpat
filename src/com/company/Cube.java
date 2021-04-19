package com.company;

public class Cube extends Square{
    public Cube(Point[] points, Point centerPoint) {
        super(points,centerPoint);
        calculateVolume();
    }

    @Override
    protected void calculateArea() {
        area = 6 * side * side;
    }

    protected void calculateVolume(){
        volume = side*side*side;
    }

    @Override
    public boolean dimension3() {
        return true;
    }
}
