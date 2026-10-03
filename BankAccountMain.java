class BankAccount {

    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName,
                double balance) {

        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

    void withdraw(double amount) {

        // Local variable
        boolean success;

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            success = true;
        } else {
            success = false;
        }

        if (success) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("AC101", "Srishti", 5000);

        account.deposit(2000);
        account.withdraw(1000);
        account.displayAccount();
    }
}