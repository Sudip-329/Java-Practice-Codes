//Q : Program to check a given number palindrome or not.
import java.util.Scanner;
class q5 {
    public static void main(String[] args) {
        int num, rn = 0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num=scan.nextInt();
        int temp = num;
        while (num != 0) {
        rem = num % 10;
        rn = rn * 10 + rem;
        num /= 10;
        }
        if (temp == rn) {
            System.out.println(temp + " is Palindrome.");
        }
        else {
            System.out.println(temp + " is not Palindrome.");
        }
    }
  }