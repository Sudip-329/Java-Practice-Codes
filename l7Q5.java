/*Define a class Savings account with static data member interest-rate and a static method 
modify-intrate(float) to change the interest-rate. This class has three non- static members as 
accountno, name, balance and also a method calculate-interest() to find the interest with existing 
interest-rate for a given period and principal amount. Check the operation of this class by calculating
 interest using one object and then modifying the interest-rate and again calculating interest using 
 another object for the same period and principal amount.*/
import java.util.Scanner;

class Savings_account
{
    Scanner inp=new Scanner(System.in);
    static double interest_rate;
    int account_no;
    String name;
    double balance;
    static void modify_intrate(double a)
    {
        interest_rate=a;
    }

    void calculate_interest()
    {
        System.out.println("Enter the number of years: ");
        int years=inp.nextInt();
        System.out.println("The ammount is: "+(balance*(1+interest_rate*years)));
    }
    Savings_account(){
        System.out.println("Enter your name: ");
        name=inp.nextLine();
        System.out.println("Enter your acccount no: ");
        account_no=inp.nextInt();
        System.out.println("Enter your balance: ");
        balance=inp.nextDouble();
    }
}

public class l7q5
{
    public static void main(String args[]){
       Savings_account s1=new Savings_account();
       Savings_account.modify_intrate(0.56);
       s1.calculate_interest();
    }
}