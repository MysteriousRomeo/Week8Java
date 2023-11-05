//2. Declare array and store any 5 countries and print them in console.

package javaPrograms;

//import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        String[] country = {"UK", "India", "Pakistan", "Srilanka", "USA"};  //Declared my array
        //System.out.println(Arrays.toString(country));                     //Printing them in console
        System.out.println(country[0]);                                     //Printing them in console
        System.out.println(country[1]);
        System.out.println(country[2]);
        System.out.println(country[3]);
        System.out.println(country[4]);

    }
}
