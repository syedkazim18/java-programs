//Temperature converter using ternary operators
import java.util.Scanner;

class temperature{
    double temp;
    String unit;

    temperature(double temp, String unit){
        this.temp = temp;
        this.unit = unit;
    }

    public void converter(){
        double newtemp = (unit.equalsIgnoreCase("c")) ? (temp-32) * 5/9 : (temp * 9/5) + 32;
        String newunit = (unit.equalsIgnoreCase("c")) ? "C" : "F";
        System.out.printf("The converted temperature is: %.2f°%s", newtemp, newunit);
    }
}

public class temperatureconvert {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = inp.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        String unit = inp.next();

        if (!unit.equalsIgnoreCase("C") && !unit.equalsIgnoreCase("F")) {
            System.out.println("Invalid unit. Please enter C or F.");
            inp.close();
            return;
        }

        temperature t1 = new temperature(temp, unit);
        t1.converter();
    }
}
