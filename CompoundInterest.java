//compound interest program
import java.util.Scanner;

class calc{
    double p;
    double r;
    double n;
    int t;
    String currency = "₹";

    calc(double p, double r, double n, int t){
        this.p = p;
        this.r = r;
        this.n = n;
        this.t = t;
    }

    public void displayCI(){
        double a = p * Math.pow(1 + (r/n), n*t);
        double CI = a - p;

        System.out.printf("Future value of investment including interest: %s%.2f%n", currency,a);
        System.out.printf("The calculated Compound Interest is: %s%.2f%n", currency,CI);
    }

}
public class CompoundInterest{
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Principle amount: ");
        double p = inp.nextDouble();

        System.out.print("Enter the interest rate: ");
        double r = inp.nextDouble();

        System.out.print("Enter the amount of time interest is compounded per year: ");
        double n = inp.nextDouble();

        System.out.print("Enter the no of years money is invested for: ");
        int t = inp.nextInt();

        r = r / 100;
        calc c1 = new calc(p, r, n, t);

        System.out.println();
        System.out.println("----Compound Interest----");
        c1.displayCI();

        inp.close();
    }
}