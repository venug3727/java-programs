import java.util.Scanner;

class Account {
    protected String customerName;
    protected long accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
        displayBalance();
    }
}

class CurrAcct extends Account {
    private double minimumBalance = 1000;
    private double serviceCharge = 50;

    public CurrAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance - minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println(
                    "Insufficient funds. Withdrawal failed. Service charge of $" + serviceCharge + " imposed.");
            balance -= serviceCharge;
        }
        displayBalance();
    }
}

class SavAcct extends Account {
    private double interestRate = 0.05; // 5%

    public SavAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " credited.");
        displayBalance();
    }
}

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a savings account
        SavAcct savingsAccount = new SavAcct("John Doe", 123456789, 5000);
        savingsAccount.displayBalance();
        savingsAccount.deposit(1000);
        savingsAccount.computeInterest();
        savingsAccount.withdraw(2000);

        // Create a current account
        CurrAcct currentAccount = new CurrAcct("Jane Doe", 987654321, 1500);
        currentAccount.displayBalance();
        currentAccount.deposit(500);
        currentAccount.withdraw(2000);

        scanner.close();
    }
}
