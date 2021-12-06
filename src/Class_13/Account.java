package Class_13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;
    int amount;
    double transfer;



    public void withdraw(int amount) {
        this.amount = amount;
        balance = balance - amount;
        if (amount > balance) {
            System.out.println("Not enough money in account to withdraw");
        } else {
            System.out.println("Updated balance is: " + balance);
        }
    }
}

