package org.example;


import GeometryLibrary.Circle;
import GeometryLibrary.Rectangle;
import GeometryLibrary.Triangle;
import ThreeDimensionalShapes.Cube;

import static GeometryUtils.GeometryUtils.centimetersToMeters;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Круг");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Прямоугольник");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник");
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());


        System.out.println("4 этап");
        System.out.println(centimetersToMeters(circle.getArea()) + " в метрах");
        System.out.println(centimetersToMeters(rectangle.getArea()) + " в метрах");
        System.out.println(centimetersToMeters(triangle.getArea()) + " в метрах");

        System.out.println("Добавил ThreeDimensionalShapes");
        Cube cube = new Cube(5, 5, 5);
        System.out.println(cube.getArea());
        System.out.println(cube.getAllArea());
        System.out.println(cube.getVolume());

    }
}