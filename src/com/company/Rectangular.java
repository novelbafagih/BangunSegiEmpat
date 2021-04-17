package com.company;

import java.util.Arrays;

public class Rectangular {
    private final Point[] points;
    protected double[] sides = new double[4];
    private final Point centerPoint;
    protected double perimeter;
    protected double area;
    protected double volume;
    protected double tallnes;

    public Rectangular(Point[] points, Point centerPoint) {
        this.points = points;
        this.centerPoint = centerPoint;
        calculatingSides();
        calculatePerimeter();
    }

    private void calculatingSides(){
        Point[] bottomPoint = new Point[points.length/2];
        Point[] upperPoint = new Point[points.length/2];

        bottomPoint[0] = points[0];

        for (int i = 1; i < 4; i++) {
            if(bottomPoint[0].getY() == points[i].getY()){
                bottomPoint[1] = points[i];
                points[i] = null;
                points[0] = null;
                break;
            }
            else if(bottomPoint[0].getX() == points[i].getX()){
                bottomPoint[1] = points[i];
                points[i] = null;
                points[0] = null;
                break;
            }
        }
        int yIndex = 0;
        for (Point y: points) {
            if(y != null){
                upperPoint[yIndex] = y;
                yIndex++;
            }
        }

        sides[0] = bottomPoint[0].distance(bottomPoint[1]);
        sides[1] = upperPoint[0].distance(upperPoint[1]);

        int sidesIndex = 2;
        if(bottomPoint[0].distance(upperPoint[0]) < bottomPoint[0].distance(upperPoint[1])){
            sides[2] = bottomPoint[0].distance(upperPoint[0]);
            sides[3] = bottomPoint[1].distance(upperPoint[1]);
        }
        else{
            sides[2] = bottomPoint[0].distance(upperPoint[1]);
            sides[3] = bottomPoint[1].distance(upperPoint[0]);
        }
        calculateTall(upperPoint[0],bottomPoint[0]);

        Arrays.sort(sides);
    }

    private void calculatePerimeter() {
        for(double side : sides){
           perimeter += side;
        }
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        if(area == 0) {
            calculateArea();
        }
        return area;
    }

    protected void calculateArea(){

    }

    public double getVolume() {
        return volume;
    }

    private void calculateTall(Point upperPoint, Point lowerPoint){

    }

    public void showSides(){
        for (double a:sides) {
            System.out.println(a);
        }
    }
}
