package fr.esiea.tools.adapter;

public class BankDetails {
    private  String bankName;
    private String accountHolderName;
    private long accountNumber;

    public  BankDetails(String bankName, String accountHolderName, int accountNumber) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
