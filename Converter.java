// Weight converter
import java.util.Scanner;

class weights{
    double w;
    String type;

    weights(double w, String type){
        this.w = w;
        this.type = type;
    }

    public void weightconverter(){
        if(type.equalsIgnoreCase("kg")){
            double result = w * 2.20462;
            System.out.printf("The converted weight in lbs is: %.2f lbs", result);
        }
        else if (type.equalsIgnoreCase("lbs")){
            double result = w / 2.20462;
            System.out.printf("The converted weight in kg is: %.2f kg", result);
        }
    }
}
public class Converter {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the weight type (kg/lbs): ");
        String type = inp.nextLine();

        if (!type.equalsIgnoreCase("kg") && !type.equalsIgnoreCase("lbs")){
            System.out.println("Invalid weight type");
            inp.close();
            return;
        }

        System.out.print("Enter the weight: ");
        double w = inp.nextDouble();

        weights w1 = new weights(w, type);

        w1.weightconverter();
    }
}

