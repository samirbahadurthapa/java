import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); 

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); 

        int sum = num1 + num2; 
        int difference = num1 - num2; 
        int product = num1 * num2; 

        System.out.println("The product is: " + product); 
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);

        if(num2 != 0){
            int quotient = num1 / num2;  
            System.out.println("The quotient is: " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}
