package fr.esiea.tools.adapter;

public class CreditCardAdapter implements ICreditCard {
    private BankDetailsContainer bankDetailsC;
    public CreditCardAdapter() {
        this.bankDetailsC = new BankDetailsContainer();
    }
    @Override
    public String getCreditCardDetails(long accountNumber) {
        BankDetails bankDetails = bankDetailsC.getBankDetailsByAccountNumber(accountNumber);
        return bankDetails.getAccountNumber() + " - " + bankDetails.getBankName() + " - " + bankDetails.getAccountHolderName();
    }
}

