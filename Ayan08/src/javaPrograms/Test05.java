//5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
//marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
//should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

package javaPrograms;

import java.util.Scanner;

public class Test05 {
    static int mathMarks;
    static int scienceMarks;
    static int englishMarks;
    static double totalMarks;
    static double totalPercentage;
    //static String result;
    static boolean result = true;
    static String grade;

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Student Roll Number: ");
        int rollNum = scanner.nextInt();

        System.out.println("Enter Math subject Marks: ");
        maths();
        //----------------------------------------------------------------
        System.out.println("Enter Science subject Marks: ");
        science();

        System.out.println("Enter English subject Marks: ");
        english();

        total();
        percentage();

        System.out.println("----------------------------------------------------------");
        System.out.println("Here is your Mark Sheet");

        System.out.println("________________________________________________");
        System.out.println("|                  Mark Sheet                  |");
        System.out.println("|                                              |");
        System.out.println("|   Name        :" + name + "                   ");
        System.out.println("|   Roll No     :" + rollNum + "                ");
        System.out.println("|                                              |");
        System.out.println("|______________________________________________|");
        System.out.println("|   Subjects        :       Marks              |");
        System.out.println("|______________________________________________|");
        System.out.println("|   Math            :      " + mathMarks + "    ");
        System.out.println("|   Science         :      " + scienceMarks + " ");
        System.out.println("|   English         :      " + englishMarks + " ");
        System.out.println("|______________________________________________|");
        System.out.println("|   Total           :      " + totalMarks + "   ");
        System.out.println("|______________________________________________|");
        System.out.println("|   Percentage      :      " + totalPercentage   );
        //System.out.println("|   Result          :      " + "Pass            ");
        //How can I call the String here? I wanted to create a string variable pass/fail and call it here.
        //I couldn't do that, so I just made it a boolean and had to pass the print statement in the method and call the method here (ehhhh long process).
        studentResult();
    }

    public static void maths() {
        Scanner scanner = new Scanner(System.in);
        int mark01 = scanner.nextInt();
        if (mark01 >= 0 && mark01 <= 100) {
            mathMarks = mark01;
        } else {
            System.out.println("Invalid input, please try again");
            maths();
        }

    }

    public static void science() {
        Scanner scanner = new Scanner(System.in);
        int mark02 = scanner.nextInt();
        if (mark02 >= 0 && mark02 <= 100) {
            scienceMarks = mark02;
        } else {
            System.out.println("Invalid input, please try again");
            science();
        }

    }

    public static void english() {
        Scanner scanner = new Scanner(System.in);
        int mark03 = scanner.nextInt();
        if (mark03 >= 0 && mark03 <= 100) {
            englishMarks = mark03;
        } else {
            System.out.println("Invalid input, please try again");
            english();
        }

    }

    public static void total() {
        totalMarks = mathMarks + scienceMarks + englishMarks;
        // System.out.println(totalMarks);
    }

    public static void percentage() {
        totalPercentage = (totalMarks / 300) * 100;
    }

    public static void studentResult() {

        if (totalPercentage >= 35) {
           result = true;

            System.out.println("|   Result          :      " + "Pass                |");
        } else {
           result = false;
            System.out.println("|   Result          :      " + "Fail                |");
        }
        if (totalPercentage >= 80) {
            grade = "A+";
            System.out.println("|   Grade           :      " + "A+                  |");
            System.out.println("|______________________________________________|");
        } else if (totalPercentage >= 60) {
            grade = "A";
            System.out.println("|   Grade           :      " + "A                   |");
            System.out.println("|______________________________________________|");
        } else if (totalPercentage >= 50) {
            grade = "B";
            System.out.println("|   Grade           :      " + "B                   |");
            System.out.println("|______________________________________________|");
        } else if (totalPercentage >= 35) {
            grade = "C";
            System.out.println("|   Grade           :      " + "C                   |");
            System.out.println("|______________________________________________|");
        }else{
            System.out.println("!!!Something went wrong, Please start over!!!");
        }
    }
}
