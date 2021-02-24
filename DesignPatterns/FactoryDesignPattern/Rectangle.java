package DesignPatterns.FactoryDesignPattern;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {     
        System.out.println("Hello from inside Rectangle::draw() method");
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Rectangle is: " + area);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }
    
}
