//Q : Print corresponding grade for the given mark using if-else statement.
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int mark = scan.nextInt();

		if(mark >= 90 && mark <= 100){
			System.out.println("Grade O");
		}else if(mark < 90 && mark >= 80){
			System.out.println("Grade A");
		}else if(mark < 80 && mark >= 70){
			System.out.println("Grade B");
		}else if(mark < 70 && mark >= 60){
			System.out.println("Grade C");
		}else if(mark < 60 && mark >= 50){
			System.out.println("Grade D");
		}else if(mark < 50 && mark >= 40){
			System.out.println("Grade E");
		}else {
			System.out.println("Failed!");
		}
	}
}