//16. Write a Java program which input any number between 1 and 7, and it prints The Day's name
//MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
//number is out of selection Print message “Week contains 1 to 7 days”

package javaPrograms;

import java.util.Scanner;

public class Test19 {

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
