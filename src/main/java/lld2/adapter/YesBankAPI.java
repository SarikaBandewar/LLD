package lld2.adapter;

public interface YesBankAPI {
    Balance checkAccountBalance(String accountNumber);

    String addBankAccount(String accountId);
}
