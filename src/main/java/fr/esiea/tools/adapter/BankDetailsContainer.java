package fr.esiea.tools.adapter;

import java.util.HashMap;
import java.util.Map;

public class BankDetailsContainer {
    private Map<Long, BankDetails> bankDetailsMap = new HashMap<>();
    public  BankDetailsContainer() {
        bankDetailsMap.put(12L, new BankDetails("Bank1", "Name1", 12));
        bankDetailsMap.put(34L, new BankDetails("Bank2", "Name2", 34));
        bankDetailsMap.put(56L, new BankDetails("Bank3", "Name3", 56));
    }
    public BankDetails getBankDetailsByAccountNumber(long accountNumber) {
        return bankDetailsMap.get(accountNumber);
    }
}
