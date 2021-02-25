package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.PaymentStrategy.CreditCardStrategy;
import DesignPatterns.StrategyDesignPattern.PaymentStrategy.Item;
import DesignPatterns.StrategyDesignPattern.PaymentStrategy.PaypalStrategy;
import DesignPatterns.StrategyDesignPattern.PaymentStrategy.ShoppingCart;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.FacebookStrategy;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.GooglePlusStrategy;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.OrkutStrategy;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.SocialMediaContext;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.TwitterStrategy;

public class StrategyPatternDemo {
    
    public static void main(String[] args) {
        // Control the flow of the application
        
        //#region SocialMediaStrategy
        // Create a context object to use strategies
        SocialMediaContext context = new SocialMediaContext();

        // Use the Facebook strategy
        context.setSocialMediaStrategy(new FacebookStrategy());
        context.connect("Craig");

        // Use the Twitter strategy
        context.setSocialMediaStrategy(new TwitterStrategy());
        context.connect("John");

        // Use the GooglePlus strategy
        context.setSocialMediaStrategy(new GooglePlusStrategy());
        context.connect("Mila");

        // Use the Orkut strategy
        context.setSocialMediaStrategy(new OrkutStrategy());
        context.connect("Pam");
        //#endregion


        //#region PaymentStrategy
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.additem(item1);
        cart.additem(item2);

        // pay with credit card
        cart.pay(new CreditCardStrategy("Craig van Straaten", "1234567890", "344", "12/15"));

        // pay with paypal
        cart.pay(new PaypalStrategy("craig@gmail.com", "password"));
    }
}
