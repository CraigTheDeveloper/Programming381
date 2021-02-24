package DesignPatterns.FactoryDesignPattern;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {     
        System.out.println("Hello from inside Circle::draw() method");
    }

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public void printArea() {
        System.out.println("Area of Circle is: " + area);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Circumference of Circle is: " + perimeter);
    }
    
}
