package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.FacebookStrategy;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.GooglePlusStrategy;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.SocialMediaContext;
import DesignPatterns.StrategyDesignPattern.SocialMediaStrategy.TwitterStrategy;

public class StrategyPatternDemo {
    
    public static void main(String[] args) {
        // Create a social media context object which allows us to communicate with friends by any social media strategy
        SocialMediaContext smContext = new SocialMediaContext();

        // Set strategy to Facebook, then connect
        smContext.setSocialMediaStrategy(new FacebookStrategy());
        smContext.connect("Craig");

        // Set strategy to Twitter, then connect
        smContext.setSocialMediaStrategy(new TwitterStrategy());
        smContext.connect("John");

        // Set strategy to Google Plus, then connect
        smContext.setSocialMediaStrategy(new GooglePlusStrategy());
        smContext.connect("Mila");
    }
}
