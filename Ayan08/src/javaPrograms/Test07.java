//7. Write a java program to input any number and find out if it’s odd or even.

package javaPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test07 {



    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even! ");
        }else{
            System.out.println("Number is Odd! ");
        }
        method();

    }
}
