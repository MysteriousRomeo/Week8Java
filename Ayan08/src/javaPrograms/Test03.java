//3. Declare multidimensional array and store 5 countries and their capital and print them in
//console.

package javaPrograms;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        String[][] country =    {{"England", "India", "Pakistan", "Srilanka", "Nepal"},
                                {"London", "New Delhi", "Islamabad", "Colombo", "Kathmandu"}};
        System.out.println("\n" + country[0][0] + " - Capital - " + country[1][0]);
        System.out.println(country[0][1] + " - Capital - " + country[1][1]);
        System.out.println(country[0][2] + " - Capital - " + country[1][2]);
        System.out.println(country[0][3] + " - Capital - " + country[1][3]);
        System.out.println(country[0][4] + " - Capital - " + country[1][4]);
    }

}
