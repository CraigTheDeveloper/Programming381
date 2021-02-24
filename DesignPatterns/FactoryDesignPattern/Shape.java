package DesignPatterns.FactoryDesignPattern;

public abstract class Shape {
    
    double area;
    double perimeter;

    //non-abstract methods - implementation provided
    public void displayMessage() {
        System.out.println("displayMessage() in the Shape abstract class");
    }

    // abstract methods - the concrete classes will each provide their own implementations of the following methods:
    public abstract void draw();
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
    public abstract void printArea();
    public abstract void printPerimeter();
}
