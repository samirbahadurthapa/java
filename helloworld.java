class Hello {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double division = (double) num1 / num2;  
        int quotient=num1/num2;

        System.out.println("The product is:" + product);
        System.out.println("The sum is :" + sum);// Joins text when used with a String (e.g., "Sum: " + 12 = "Sum: 12")                                 
        System.out.println("The difference is " + difference);
        System.out.println("The division is:" + division); 
        System.out.println("The quotient is:"+quotient);
    }
}