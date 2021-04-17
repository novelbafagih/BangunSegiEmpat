package com.company;

public class Main {

    public static void main(String[] args) {
        //Rectangle
        Point[] points = new Point[4];

        System.out.println("NORMAL TRAPEZOID");
        points[0] = new Point(0,0);
        points[1] = new Point(3,4);
        points[2] = new Point(13,4);
        points[3] = new Point(16,0);
        Trapezoid trapezoid = new Trapezoid(points,null);
        printAreaPerimeter(trapezoid);

        System.out.println();
        System.out.println("OBLIQUE TRAPEZOID");
        points[0] = new Point(0,0);
        points[1] = new Point(4,3);
        points[2] = new Point(4,13);
        points[3] = new Point(0,16);
        Trapezoid trapezoidOblique = new Trapezoid(points,null);
        printAreaPerimeter(trapezoidOblique);

        System.out.println();
        System.out.println("PARALLELOGRAM");
        points[0] = new Point(0,0);
        points[1] = new Point(4,0);
        points[2] = new Point(1,3);
        points[3] = new Point(5,3);
        Parallelogram parallelogram = new Parallelogram(points,null);
        printAreaPerimeter(parallelogram);

        System.out.println();
        System.out.println("RECTANGLE");
        points[0] = new Point(0,0);
        points[1] = new Point(12,0);
        points[2] = new Point(0,5);
        points[3] = new Point(12,5);
        Rectangle rectangle = new Rectangle(points,null);
        printAreaPerimeter(rectangle);

        System.out.println();
        System.out.println("BLOCK");
        points[0] = new Point(0,0);
        points[1] = new Point(12,0);
        points[2] = new Point(0,5);
        points[3] = new Point(12,5);
        Block block = new Block(points,null,3);
        printAreaPerimeter(block);

        System.out.println();
        System.out.println("SQUARE");
        points[0] = new Point(0,0);
        points[1] = new Point(0,2);
        points[2] = new Point(2,0);
        points[3] = new Point(2,2);
        Square square = new Square(points,null);
        printAreaPerimeter(square);


        System.out.println();
        System.out.println("CUBE");
        points[0] = new Point(0,0);
        points[1] = new Point(0,2);
        points[2] = new Point(2,0);
        points[3] = new Point(2,2);
        Cube cube = new Cube(points,null);
        printAreaPerimeter(cube);
    }

    public static void printAreaPerimeter(Rectangular rectangular){
        String dimension = rectangular.dimension3()?
                            "SURFACE AREA" : "AREA";
        System.out.println(dimension + ": " + rectangular.getArea());
        if(!rectangular.dimension3())
            System.out.println("PERIMETER: " + rectangular.getPerimeter());
        if(rectangular.dimension3())
            System.out.println("VOLUME " + rectangular.getVolume());
    }
}
