package DesignPatterns.StrategyDesignPattern.PaymentStrategy;

public class CreditCardStrategy implements IPaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
       System.out.println(amount + " paid using credit card.");
       System.out.println("Cardholder: " + name);
       System.out.println("Card number: " + cardNumber);
       System.out.println("Cvv: " + cvv);
       System.out.println("Expiry date: " + expiryDate);
    }  
}
