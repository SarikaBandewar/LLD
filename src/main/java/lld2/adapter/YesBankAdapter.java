package lld2.adapter;

public class YesBankAdapter implements BankAPI {

    private YesBankAPI yesBankAPI;

    public YesBankAdapter(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }

    @Override
    public void addBankAccount(BankAccount bankAccount) {

    }

    @Override
    public double checkBalance(BankAccount bankAccount) {
        Balance balance = yesBankAPI.checkAccountBalance(bankAccount.getAccountNumber());
        return balance.getBalance();
    }
}
