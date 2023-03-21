/*Write a Java Program to define a class Employee with data members as empid, basic,
DA which are taken from user and a method as salary which adds basic with DA and 
prints total along-with empid. Derive a class Manager with a data member tallowance
which is calculated as 10% of basic. And also override the method salary which adds
basic, DA, tallowance and prints total along-with empid. Write the complete program
to check method overriding.*/

import java.util.Scanner;

class Employee {
    int empid;
    double basic;
    double DA;

    Employee(int empid, double basic, double DA) {
        this.empid = empid;
        this.basic = basic;
        this.DA = DA;
    }

    void salary() {
        double total = basic + DA;
        System.out.println("Employee ID: " + empid);
        System.out.println("Total Salary: " + total);
    }
}

class Manager extends Employee {
    double tallowance;

    Manager(int empid, double basic, double DA) {
        super(empid, basic, DA);
        this.tallowance = 0.1 * basic;
    }

    //@Override
    void salary() {
        double total = basic + DA + tallowance;
        System.out.println("Employee ID: " + empid);
        System.out.println("Total Salary: " + total);
    }
}

public class l9q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int empid = sc.nextInt();
        System.out.println("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.println("Enter DA: ");
        double DA = sc.nextDouble();

        Employee emp = new Employee(empid, basic, DA);
        emp.salary();

        Manager mgr = new Manager(empid, basic, DA);
        mgr.salary();
    }
}
