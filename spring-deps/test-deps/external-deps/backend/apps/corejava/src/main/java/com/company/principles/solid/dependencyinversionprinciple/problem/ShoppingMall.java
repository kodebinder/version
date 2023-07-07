package com.company.principles.solid.dependencyinversionprinciple.problem;

public class ShoppingMall {

    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}