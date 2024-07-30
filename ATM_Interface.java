import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double originalBalance){
        this.balance = originalBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of Rs." + amount + "successful. Current Balance: Rs." + balance);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawl(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawl of Rs." + amount + "successful. Current Balance: Rs." + balance);
        }else{
            System.out.println("Invalid withdrawl amount or unsufficient balance.");
        }
    }
}

class ATM{
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    public void displayMenu(){
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawl");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice, Scanner sc){
        switch (choice) {
            case 1:
                System.out.println("Current balance: Rs." + bankAccount.getBalance());
                break;
            case 2:
                System.out.println("Enter deposit amount: Rs.");
                double depositAmount = sc.nextDouble();
                bankAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter withdrawl amount: Rs.");
                double withdrawlAmount = sc.nextDouble();
                bankAccount.withdrawl(withdrawlAmount);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option");
        }
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter original account balance: Rs.");
        double originalBalance = sc.nextDouble();
        BankAccount bankAccount = new BankAccount(originalBalance);

        ATM atm = new ATM(bankAccount);

        while (true) {
            atm.displayMenu();
            System.out.println("Select an option: ");
            int choice = sc.nextInt();

            atm.performTransaction(choice, sc);
        }
    }
}