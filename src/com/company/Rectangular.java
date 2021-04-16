package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rectangular {
    private Point[] points;
    protected double[] sides = new double[4];
    private Point centerPoint;
    protected double perimeter;
    protected double area;
    protected double volume;

    public Rectangular(Point[] points, Point centerPoint) {
        this.points = points;
        this.centerPoint = centerPoint;
        calculatingSides();
        calculatePerimeter();
    }

    private void calculatingSides(){
        double[] sidesComparison = new double[3];
        double[] sidesComparisonNonSorted = new double[3];

        for (int i = 1; i < 4; i++) {
            sidesComparison[i-1] = points[0].distance(points[i]);
            sidesComparison[i-1] = sidesComparisonNonSorted[i-1];
        }

        Arrays.sort(sidesComparison);
        int lastPointIndex = Arrays.binarySearch(sidesComparisonNonSorted,sidesComparison[2]);
        Point lastPoint = points[lastPointIndex];

        int sidesLastIndex = 0;
        for(sidesLastIndex = 0; sidesLastIndex < 2;sidesLastIndex++){
            sides[sidesLastIndex] = sidesComparison[sidesLastIndex];
        }

        for (int i = 1; i < 4; i++) {
            if(i != lastPointIndex) {
                sides[sidesLastIndex] = lastPoint.distance(points[i]);
                sidesLastIndex++;
            }
        }
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
        return area;
    }

    public double getVolume() {
        return volume;
    }
    public void showSides(){
        for (double side: sides) {
            System.out.println(side);
        }
    }
}
