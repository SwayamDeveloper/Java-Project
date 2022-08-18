//Designing Calculator

import java.util.Scanner;
public class Calculater {
         public static void main(String[] args) {
        	 char operator;
        	 Double number1, number2, result;
        	 
//        	 Create an object of Scanner class
        	 Scanner input = new Scanner(System.in);
        	 
//        	 ask users to enter operator
        	 System.out.println("Choose an operator: + ,- , *, /");
        	 operator = input.next().charAt(0);
        	
//        	 ask users to enter numbers
        	 System.out.println("Enter first number: ");
        	 number1 = input.nextDouble();
        	 

        	 System.out.println("Enter Second number: ");
        	 number2 = input.nextDouble();
        	 
        	 switch (operator) {
        	 
//        	 performs addition between numbers
        	 case '+':
        		 result = number1 + number2;
        		 System.out.println(number1+number2);
        		 break;
        	
//        	performs Subtraction between numbers	 
        		  case '-':
        		 result = number1 - number2;
        		 System.out.println(number1-number2);
        		 break;
        		 
//             performs Multiplication between numbers
        	 
        	 case '*':
        		 result = number1 * number2;
        		 System.out.println(number1*number2);
        		 break;
        	
//        	performs division between numbers	 
        	 case '/':
        		 result = number1 / number2;
        		 System.out.println(number1/number2);
        		 break;
        		 
        		 default:
        			 System.out.println("Invalid operator!");
        			 break;
        	 }
        	 
         }
} 
