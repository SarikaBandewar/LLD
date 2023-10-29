package lld2.adapter;

public interface BankAPI {
    void addBankAccount(BankAccount bankAccount);

    double checkBalance(BankAccount bankAccount);
}
