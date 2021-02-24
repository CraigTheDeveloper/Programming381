package DesignPatterns.FactoryDesignPattern;

import java.util.Scanner;

public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        // We'll just control the flow of the program here but not the core logic
        Scanner input = new Scanner(System.in);
        String menuString = "";
        
        do {
            System.out.println("What shape do you want? Type \"Circle\", \"Square\" or \"Rectangle\". Type \"exit\" to quit.");
            menuString = input.nextLine();

            Shape userShape = ShapeFactory.getShape(menuString);            
            userShape.draw();
            System.out.println("Type of shape is: " + userShape.getClass());

        } while (!menuString.equalsIgnoreCase("exit"));
 
    }
}
