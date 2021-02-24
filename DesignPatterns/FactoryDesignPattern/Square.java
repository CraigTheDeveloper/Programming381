package DesignPatterns.FactoryDesignPattern;

public class Square extends Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void draw() {     
        System.out.println("Hello from inside Square::draw() method");
    }

    @Override
    public void calculateArea() {
        area = length * length;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = length * 4;
    }

    @Override
    public void printArea() {
        System.out.println("Area of Square is: " + area);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Square is: " + perimeter);
    }
    
}
