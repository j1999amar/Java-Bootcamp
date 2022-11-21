import java.util.Scanner;

public class Calculator {
     void addition(double number1, double number2){
        double Answer=number1+number2;
         System.out.println("Addition of "+number1+ " and "+number2+" is : "+Answer);

    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Calculator calculator =new Calculator();
        double number1= scanner.nextDouble();
        double number2= scanner.nextDouble();
        calculator.addition( number1,number2);

    }
}
