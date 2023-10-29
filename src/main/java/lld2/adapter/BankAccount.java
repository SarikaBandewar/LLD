package lld2.adapter;

public class BankAccount {
    private String accountNumber;
    private String holderName;

    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
