package com.awacademy.geometry.shapes;

import com.awacademy.geometry.base.Point;
import com.awacademy.geometry.base.Shape;

public class Triangle implements Shape {

    Point top;
    int base;
    int height;

    public Triangle(Point top, int base, int height) {
        this.top = top;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculatePerimeter() {
        int a = height*height + base*base;
        return (Math.sqrt(a)) +height + base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "top=" + top +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
