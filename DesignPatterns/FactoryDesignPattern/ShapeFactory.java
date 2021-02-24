package DesignPatterns.FactoryDesignPattern;

public class ShapeFactory {
    
    public static Shape getShape() {
        return new Circle(24);
    }
}
