package DesignPatterns.FactoryDesignPattern.Shape;

public class ShapeFactory {
    
    // method used to instantiate an object of type shape
    public static IShape getShape(String shapeType) {
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
