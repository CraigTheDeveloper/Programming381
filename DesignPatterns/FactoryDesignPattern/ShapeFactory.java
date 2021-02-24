package DesignPatterns.FactoryDesignPattern;

public class ShapeFactory {
    
    // method used to instantiate an object of type shape
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
