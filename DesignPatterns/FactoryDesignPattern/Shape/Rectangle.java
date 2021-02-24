package DesignPatterns.FactoryDesignPattern.Shape;

public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectange::draw() method.");
    }
    
}
