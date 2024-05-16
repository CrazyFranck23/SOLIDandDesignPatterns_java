package fr.esiea.tools.adapter;

public class CreditCardUser {
    private  ICreditCard creditCard;
    public CreditCardUser (ICreditCard cc) {
        creditCard = cc;
    }
    public void displayMyCreditCardDetails(long accountNumber) {
        String details = creditCard.getCreditCardDetails(accountNumber);
        System.out.println(details);
    }
}
