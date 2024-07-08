import java.util.Scanner;


class BankAccount {
    private double balance;

   
    public BankAccount(double balance) {
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited RS " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrew RS " + amount);
            } else {
                System.out.println("Insufficient balance can`t withdraw money.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}


class ATM {
    private BankAccount ba;
    private Scanner sc;

    
    public ATM(BankAccount ba) {
        this.ba = ba;
        this.sc = new Scanner(System.in);
    }

    
    public void run() {
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you..Have a nice day !! ");
                    return;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
            }
        }
    }

  
    private void checkBalance() {
        double balance = ba.getBalance();
        System.out.println("Your current balance is: " + balance +" RS");
    }

   
    private void deposit() {
        System.out.print("Enter deposit amount: RS ");
        double amount = sc.nextDouble();
        ba.deposit(amount);
    }

    
    private void withdraw() {
        System.out.print("Enter withdraw amount: RS ");
        double amount = sc.nextDouble();
        ba.withdraw(amount);
    }
}


class Main {
    public static void main(String[] args) {
       
        BankAccount account = new BankAccount(5000.0);

       
        ATM atm = new ATM(account);

       
        atm.run();
    }
}
