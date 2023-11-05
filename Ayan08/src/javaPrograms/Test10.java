//10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
//fined this sales

package javaPrograms;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {

        float commission = 0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter Seller's Name: ");
        String name = scanner.next();

        System.out.println("Enter sales amount: ");
        int sales = scanner.nextInt();

        System.out.println("Enter basic salary: ");
        int salary = scanner.nextInt();

        if(sales >= 50000)
            commission = 0.35f * sales;
        else if(sales >= 30000)
            commission = 0.2f * sales;
        else if(sales >= 20000)
            commission = 0.1f * sales;
        else if(sales >= 10000)
            commission = 0.05f * sales;
        else if(sales < 10000)
            commission = 0.02f * sales;

        System.out.println("Gross salary (basic salary + commission " + commission + " = " + (salary + commission));
    }
}
