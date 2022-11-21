import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
     void addition(double number1, double number2){
        double Answer=number1+number2;
         System.out.println("Addition of "+number1+ " and "+number2+" is : "+Answer);
    }
    void subraction(double number1, double number2){
        double Answer=number1-number2;
        System.out.println("Subraction of "+number1+ " and "+number2+" is : "+Answer);
    }
    void multiplication(double number1, double number2){
        double Answer=number1*number2;
        System.out.println("multiplication of "+number1+ " and "+number2+" is : "+Answer);
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Calculator calculator =new Calculator();
        System.out.println("Enter the first number ");
        double number1= scanner.nextDouble();
        System.out.println("Enter the calc operation + - * / ");
        String calc= scanner.next();
        System.out.println("Enter the Second number ");
        double number2= scanner.nextDouble();
        switch (calc){

            case "+":
                calculator.addition( number1,number2);
            case "-":
                calculator.subraction( number1,number2);
                break;
            case "*":
                calculator.multiplication( number1,number2);
            default:



        }

    }
}
