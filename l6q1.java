//Write a program in java to find the average of all users entered numbers at the command line.
import java.util.*;

public class l6q1{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers : ");
        a= sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("1st number is the largest number.");
        }
        else if(b>a && b>c)
        {
            System.out.println("2nd number is the largest number.");
        }
        else{
            System.out.println("3rd number is the largest number.");
        }
    }
}