package lld2.adapter;

public class Client {
    public static void main(String[] args) {

        YesBankAPI yesBankAPI = new YesBankAPIImpl();

        BankAPI bankAPI = new YesBankAdapter(yesBankAPI);

        PhonePe phonePe = new PhonePe(bankAPI);

        double amount = phonePe.performBankOperation();

        System.out.println("Account balance : " + amount);


    }

}
