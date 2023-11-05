//11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
//other alphabet should be invalid entry.

package javaPrograms;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {

        float commission = 0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any alphabet from A to F: ");
        String alphabet = scanner.next();

        if(alphabet.equals("a") || alphabet.equals("A"))
            System.out.println("City name = Ahmedabad");
        else if(alphabet.equals("b") || alphabet.equals("B"))
            System.out.println("City name = Bhopal");
        else if(alphabet.equals("c") || alphabet.equals("C"))
            System.out.println("City name = Chennai");
        else if(alphabet.equals("d") || alphabet.equals("D"))
            System.out.println("City name = Dehradun");
        else if(alphabet.equals("e") || alphabet.equals("E"))
            System.out.println("City name = East Manipur");
        else if(alphabet.equals("f") || alphabet.equals("F"))
            System.out.println("City name = Faridabad");
        else System.out.println("invalid entry!");

        method();

    }
}
