//Q : Write a program that inputs the number of hours that an employee works and the
//    employees hourly wage. Dissplay the employees gross pay.

import java.util.Scanner;
class q6 {
    public static void main(String[] args) {
        int hour, wage;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hour : ");
        hour=scan.nextInt();
        System.out.println("Enter wage : ");
        wage=scan.nextInt();
        System.out.println("The gross pay : "+(hour*wage));

    }
  }