//14. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

package javaPrograms;

public class Test14 {

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        for(int i = 1; i <=100; i++){
            if(i%3 ==0){
                System.out.print(i);
                System.out.print(" ");
            }

        }
        System.out.println("");
    }
    public static void method2(){
        for(int i = 1; i <=100; i++) {
            if (i % 5 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }
}
