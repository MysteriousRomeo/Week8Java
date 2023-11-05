//Write a Java program to reverse a word.
package javaPrograms;


import java.util.Scanner;

public class Test26 {

    public static void main(String[] args) {
        method();
    }

    public static void method(){
        String revWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word you want to reverse: ");
        String word = scanner.next();

        for(int i=0; i<word.length(); i++){
            char character = word.charAt(i); //getting info of each character here from the word
            revWord = character+revWord;

            System.out.println("Reverse of the given word is : " + revWord);
        }
    }
}

