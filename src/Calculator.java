import java.util.Scanner;

public class Calculator {
    Scanner scanner=new Scanner(System.in);
    void menuDriven(){
        System.out.println("\nCalculator\n");
        System.out.println("Enter the math opertoration : 1 for Addition 2 for Subraction, 3 for Multiplication, 4 for Division, 5 for Exit ");
        System.out.println("\nEnter the choice ");
        int cal=scanner.nextInt();
        mathOperation(cal);

    }
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
        System.out.println("Multiplication of "+number1+ " and "+number2+" is : "+Answer);
    }void division(double number1, double number2){
        double Answer=number1/number2;
        System.out.println("Division of "+number1+ " and "+number2+" is : "+Answer);
    }



    void mathOperation(int cal){
        switch (cal){

            case 1:
                System.out.println("Addition");
                System.out.println("Enter the first number ");
                double number1= scanner.nextDouble();
                System.out.println("Enter the Second number ");
                double number2= scanner.nextDouble();
                addition( number1,number2);
                break;
            case 2:
                System.out.println("Subraction");
                System.out.println("Enter the first number ");
                 number1= scanner.nextDouble();
                System.out.println("Enter the Second number ");
                number2= scanner.nextDouble();
                subraction( number1,number2);
                break;


            case 3:
                System.out.println("Multiplication");
                System.out.println("Enter the first number ");
                 number1= scanner.nextDouble();
                System.out.println("Enter the Second number ");
                 number2= scanner.nextDouble();
                multiplication( number1,number2);
                break;
            case 4:
                System.out.println("Division");
                System.out.println("Enter the first number ");
                 number1= scanner.nextDouble();
                System.out.println("Enter the Second number ");
                 number2= scanner.nextDouble();
                division( number1,number2);
                break;
            case 5:
                System.out.println("Thankt you");
               System.exit(0);
                break;



            default:
                System.out.println("Enter the correct math operation like + - * / ");
                break;

        }



    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Calculator calculator =new Calculator();
        calculator.menuDriven();
        while (1>0){
            calculator.menuDriven();




        }





    }
}
