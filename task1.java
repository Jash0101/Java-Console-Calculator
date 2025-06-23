//task-1 -> Java console calculator
import java.util.*;
public class task1{

    public static double sum(double a, double b){
        return a + b;
    }
    
    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if(b == 0){
            System.out.println("Can not divide by zero");
            return 0;
        }
        return a / b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean inputs = true;
        
        while (inputs) { 
           System.out.println("Enter the value for a: "); 
           double a = sc.nextDouble();

           System.out.println("Select the operator (+,-,*,/): ");
           char operator = sc.next().charAt(0);

           System.out.println("Enter the value for b: ");
           double b = sc.nextDouble();

           double result;

           switch(operator){
                case '+':
                    result = sum(a, b);
                    break;

                case '-':
                    result = subtract(a, b);
                    break;

                case '*':
                     result = multiply(a, b);
                     break;

                case '/':
                    result = divide(a, b);
                    break;

                default:
                    System.out.println("Invalid operator");
                    continue;
           }
           System.out.println("Answer : " + result);
           
           System.out.println("Do you want to perform another calculation? (yes,no)");
           String more = sc.next();
           if(!more.equalsIgnoreCase("yes")){
                inputs = false;
                System.out.println("Calculator closed! Thank you.");
           }
           
        }
        sc.close();
    }
}