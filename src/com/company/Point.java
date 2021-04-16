package com.company;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point b){
        return Math.sqrt(Math.pow(this.x - b.x,2) + Math.pow(this.y - b.y,2));
    }
}
