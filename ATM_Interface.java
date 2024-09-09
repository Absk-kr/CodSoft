import java.util.Scanner;


// MODULE 1 : CHECK THE AVAILABLE BALANCE & INITIALISE BALANCE TO A/C
class BankAcct {
    private double bal;

    public BankAcct(double IB) {
        bal = IB; //initial balance (IB)
    }
    public double getbal() {
        return bal;
    }

// MODULE 2 : DEPOSIT MONEY IN A/C USING ATM
    public void deposit(double amt) {
        bal += amt;
    }

//MODULE 3 : WITHDRAW CASH FROM ATM
public boolean withdraw(double amt) {
        if (amt <= bal) {
               bal -= amt;
            return true;
        } else {
             return false;
        }
    }
}

class ATM_UI {
    private BankAcct account;

    public ATM_UI(BankAcct account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\n");
        System.out.println("******* Welcome to the ATM! *******");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
  public void PT() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double amt;

        while (true) {
            displayMenu();
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: Rs. " + account.getbal());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs. ");
                    amt = sc.nextDouble();
                    if (amt > 0) {
                        account.deposit(amt);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs. ");
                    amt = sc.nextDouble();
                    if (amt > 0 && account.withdraw(amt)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM_Service!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class ATM_Interface{
    public static void main(String[] args) {
        BankAcct userAccount = new BankAcct(100000); 
        ATM_UI atm = new ATM_UI(userAccount);
        atm.PT();
    }
}