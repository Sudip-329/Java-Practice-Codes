//Q : Print the result of AND, OR & XOR operation of two integers.
import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("And Operation : "+(a&b));
        System.out.println("OR Operation : "+(a|b));
        System.out.println("XOR Operation : "+(a^b));
    }
}
