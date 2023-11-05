//4. Write if else condition and print your group name in console else others group name.

package javaPrograms;

public class Test04 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        String myGroup = "Code2";

        if(myGroup.contains("Code2")){
            System.out.println(myGroup + " -This is my Group");
        }else
            System.out.println("Wrong Group!!! Go to Agile and find out.");
    }

}
