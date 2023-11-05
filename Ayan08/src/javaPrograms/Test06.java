//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PFPrint in following format

package javaPrograms;

import java.util.Scanner;

public class Test06 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee id: ");
        String id = scanner.nextLine();

        System.out.println("Enter Employee name: ");
        String name = scanner.next();

        System.out.println("Enter your basic salary: ");
        float salary = scanner.nextFloat();

        double hra = 0.1 * salary;
        double ta = 0.08 * salary;
        double da = 0.09 * salary;
        double pf = 0.2 * salary;
        double gs = (salary + hra + ta + da) - pf;


        System.out.println("|                Salary Slip             |");
        System.out.println("|________________________________________|");
        System.out.println("| Employee ID            : " + id   );
        System.out.println("| Employee Name          : " + name   );
        System.out.println("|________________________________________|");
        System.out.println("| Basic Salary           : " + salary );
        System.out.println("| HRA 10%                : " + hra);
        System.out.println("| TA 8%                  : " + ta);
        System.out.println("| DA 9%                  : " + da);
        System.out.println("| -PF 20%                : " + pf);
        System.out.println("|________________________________________|");
        System.out.println("| Gross Salary           : " + gs);
        System.out.println("|========================================|");
    }
}
