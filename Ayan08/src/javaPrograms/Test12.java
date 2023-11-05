//12. Write a java program to get numbers from users and print whether it is positive or negative. using switch statement.

package javaPrograms;

import java.util.Scanner;

public class Test12 {



    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int number, caseNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        number = scanner.nextInt();

        if (number > 0){
            caseNumber = 1;
        }
        else if (number < 0){
            caseNumber = 2;
        }else caseNumber = 3;


        switch (caseNumber){
            case 1:
                System.out.println("Number is Positive! ");
                method();
                break;

            case 2:
                System.out.println("Number is Negative! ");
                method();
                break;

            default:
                System.out.println("Number is Zero or Neutral !!! ");
                method();
        }
    }
}
