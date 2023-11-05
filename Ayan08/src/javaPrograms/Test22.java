//22. Write a Java program to calculate the average value of array elements.

package javaPrograms;


public class Test22 {
    static int[] num = {10, 25, 38, 42, 61};

    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum += num[i];

        float avg = sum / num.length;
        System.out.println("avg of all the numbers in the array = " + avg);
    }
}

