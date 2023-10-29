package lld2.adapter;

public class YesBankAPIImpl implements YesBankAPI {
    @Override
    public Balance checkAccountBalance(String accountNumber) {
        return new Balance(100);
    }

    @Override
    public String addBankAccount(String accountId) {
        return null;
    }
}
