//13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//find addition, Subtraction, multiplication and division according to their symbol(using if else)

package javaPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test13 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Please Enter Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Please Enter any Operator" + "(+, -, /, *): ");
        String operator = scanner.next();

        if (operator.equals("+")){
            System.out.println("Addition of two numbers " + num1 + operator + num2 + " = " + (num1 + num2));
        }else if(operator.equals("-")){
            System.out.println("Subtraction from Number1 of Number2 " + num1 + operator + num2 + " = " + (num1 - num2));
        }else if(operator.equals("/")) {
            System.out.println("Division of Number1 and Number 2 " + num1 + operator + num2 + " = " + (num1 / num2));
        }else if(operator.equals("*")) {
            System.out.println("Multiplication of Number1 and Number2 " + num1 + operator + num2 + " = " + (num1 * num2));
        }else{
            System.out.println("Invalid Input");
        }
        method();

    }
}
