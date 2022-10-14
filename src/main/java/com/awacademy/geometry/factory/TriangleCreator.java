package com.awacademy.geometry.factory;

import com.awacademy.geometry.base.Point;
import com.awacademy.geometry.base.Shape;
import com.awacademy.geometry.base.ShapeCreator;
import com.awacademy.geometry.shapes.Triangle;

import java.util.Scanner;

public class TriangleCreator implements ShapeCreator {

    @Override
    public Shape askDataAndCreateShape(Scanner sc) {
        System.out.println("x-coordinate of top point?");
        int x = sc.nextInt();
        System.out.println("y-coordinate of top point?");
        int y = sc.nextInt();
        System.out.println("Length of base?");
        int base = sc.nextInt();
        System.out.println("Length of height?");
        int height = sc.nextInt();
        Point top = new Point(x, y);
        Triangle triangle = new Triangle(top, base, height);
        return triangle;
    }
}
