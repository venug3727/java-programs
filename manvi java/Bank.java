import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String customerName, int accountNumber, String accountType, double balance, double interestRate) {
        super(customerName, accountNumber, accountType, balance);
        this.interestRate = interestRate;
    }

    public void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " computed and deposited.");
    }
}

class CurrentAccount extends Account {
    double minBalance;
    double serviceCharge;

    public CurrentAccount(String customerName, int accountNumber, String accountType, double balance, double minBalance, double serviceCharge) {
        super(customerName, accountNumber, accountType, balance);
        this.minBalance = minBalance;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal failed due to insufficient funds or minimum balance constraint.");
        }
    }

    public void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of $" + serviceCharge + " imposed due to falling below minimum balance.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank!");
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Account account;
        if (accountType.equalsIgnoreCase("Savings")) {
            System.out.print("Enter interest rate: ");
            double interestRate = scanner.nextDouble();
            account = new SavingsAccount(customerName, accountNumber, accountType, initialBalance, interestRate);
        } else if (accountType.equalsIgnoreCase("Current")) {
            System.out.print("Enter minimum balance: ");
            double minBalance = scanner.nextDouble();
            System.out.print("Enter service charge: ");
            double serviceCharge = scanner.nextDouble();
            account = new CurrentAccount(customerName, accountNumber, accountType, initialBalance, minBalance, serviceCharge);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute Interest (Savings only)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).checkMinimumBalance();
                    }
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).computeInterest();
                    } else {
                        System.out.println("Interest computation is not available for Current accounts.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
