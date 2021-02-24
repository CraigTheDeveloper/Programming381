package DesignPatterns.FactoryDesignPattern;

import java.util.Scanner;
import DesignPatterns.FactoryDesignPattern.Shape.IShape;
import DesignPatterns.FactoryDesignPattern.Shape.ShapeFactory;

public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        // We'll just control the flow of the program here but not the core logic
        Scanner input = new Scanner(System.in);
        String menuString = "";
        
        // Ask what shape the user wants and use the shape factory to create the respective shape
        do {
            System.out.println("What shape do you want? Type \"Circle\", \"Square\" or \"Rectangle\". Type \"exit\" to quit.");
            menuString = input.nextLine();

            IShape userShape = ShapeFactory.getShape(menuString);            
            userShape.draw();
            System.out.println("Type of shape is: " + userShape.getClass());

        } while (!menuString.equalsIgnoreCase("exit"));
 
        input.close();
    }
}
