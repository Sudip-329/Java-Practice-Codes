// Write a program to take two strings from user and check whether one string is
// present in the other string.

import java.util.*;

public class Lab13_q3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        if (str1.contains(str2))
            System.out.println("String 2 is present in String 1");
        else
            System.out.println("String 2 is not present in String 1");
    }
}