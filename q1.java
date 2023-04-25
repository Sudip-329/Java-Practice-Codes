//Q : Take Name,section,branch,rollno as user input and print them in separate lines.
import java.util.Scanner;
public class q1{
    public static void main(String args[])
    {
        String name, section, branch;
        int rollno;
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name: ");
        name=scan.nextLine();

        System.out.println("Enter your section: ");
        section=scan.nextLine();

        System.out.println("Enter your branch: ");
        branch=scan.nextLine();

        System.out.println("Enter your rollno: ");
        rollno=scan.nextInt();

        System.out.println("Your name is: "+name);
        System.out.println("Your section is: "+section);
        System.out.println("Your branch is: "+branch);
        System.out.println("Your rollno is: "+rollno);
    }
}