//15. Write a program that tells us input value is number or an alphabet or symbol.

package javaPrograms;

import java.util.Scanner;

public class Test15 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a value: ");
        String value = scanner.next();

        if (value.matches("[0-9]]+")){
            System.out.println("The input is a Number!!");
        }else if (value.matches("[a-zA-Z]"+"")){
            System.out.println("The input is an Alphabet!!");
        }else{
            System.out.println("The input is a Symbol!!");
        }

        method();
    }
}
