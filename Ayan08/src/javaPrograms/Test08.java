//8. Write a java program to get numbers from users and print whether it is positive or negative.

package javaPrograms;

import java.util.Scanner;

public class Test08 {



    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        if(num < 0){
            System.out.println("Number is Negative! ");
        }else if(num > 0){
            System.out.println("Number is Positive! ");
        }else if(num == 0){
            System.out.println("Number is Neutral/Zero! ");
        }
        method();

    }
}
