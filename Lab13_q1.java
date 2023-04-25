// WAP to determine whether a given string is palindrome or not

import java.util.*;
public class Lab13_q1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not: ");
        String str = scan.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) //compare two strings ignoring lower and uppercase charactr
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
    }
}