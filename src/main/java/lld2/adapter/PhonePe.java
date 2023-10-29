package lld2.adapter;

public class PhonePe {
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    double performBankOperation() {
        BankAccount bankAccount = new BankAccount("1234", "Sarika");
        bankAPI.addBankAccount(bankAccount);

        double balance = bankAPI.checkBalance(bankAccount);
        System.out.println("Balance : " + balance);
        return balance;
    }
}
