//1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
//operator (? :)

package javaPrograms;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        takeInput();
    }

    public static void takeInput(){
        Scanner myInput = new Scanner(System.in);           //using scanner to take input from user
        System.out.println("Please enter any number: ");
        int input = myInput.nextInt();                      //

        if (input % 2 == 0){
            System.out.println("Input number is EVEN!");
        }else
        System.out.println("Input number is ODD!");
    }
}
