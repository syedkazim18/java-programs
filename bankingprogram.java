// Simple Banking Program
import java.util.Scanner;

class Bank{

    private double balance;

    Bank( double balance){
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if (amount>0) {
            balance += amount;
            System.out.println("Amount deposited!");
            return true;
        }
        else {
            System.out.println("Invalid amount!");
            return false;
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && amount<=balance){
            balance -= amount;
            System.out.println("Amount withdrawal successful!");
            return true;
        }
        else{
            System.out.println("Insufficient balance in your account!");
            return false;
        }
    }

    public void showbalance(){
        System.out.printf("Your remaining balance is %.2f\n", balance);
    }
}


public class bankingprogram {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        double balance = 0;
        Bank b1 = new Bank(balance);
        double amount;

        System.out.println("=======Bank of Java=======");
        int choice;


        do{
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Show Balance ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();


            switch (choice){
                case 1:
                    System.out.print("Enter the amount you want to deposit: ");
                    amount = inp.nextDouble();
                    b1.deposit(amount);
                    break;
                case 2 :
                    System.out.print("Enter the amount you want to withdraw: ");
                    amount = inp.nextDouble();
                    b1.withdraw(amount);
                    break;
                case 3 :
                    b1.showbalance();
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }
        while(choice != 4);
        inp.close();
    }
}

