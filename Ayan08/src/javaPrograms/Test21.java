//21. Write a Java program to sum values of an array.

package javaPrograms;


public class Test21 {
    static int[] num = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int sum = num[0]+ num[1] + num[2] + num[3] + num[4];
        System.out.println("sum of all the numbers in the array = " + sum);
    }
}
