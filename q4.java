//Print the corresponding week day (user input) of the current month(February)
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day_number 1 to 28 for month February, 2023 : ");
        int d = scan.nextInt();

        switch (d) {
            case 6,13,20,27:
                System.out.println("Monday");
                break;
            case 7,14,21,28:
                System.out.println("Tuesday");
                break;
            case 1,8,15,22:
                System.out.println("Wednesday");
                break;
            case 2,9,16,23:
                System.out.println("Thursday");
                break;
            case 3,10,17,24:
                System.out.println("Friday");
                break;
            case 4,11,18,25:
                System.out.println("Saturday");
                break;
            case 5,12,19,26:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please enter a valid number brom 1 to 28");
                break;
        }
    }
}