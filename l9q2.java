/*Write a program in java to create a class Bank having ROI (Rate of Interest) data
member and find_ROI() member function. Derive two classes HDFC, ICICI with find_ROI()
function. The ROI of HDFC bank is calculated as ROI = (Last year annual profit / 1.5
crore) where the annual profit is an user entered value. The ROI of ICICI bank is 
calculated as ROI = Fund supported by RBI in crore / 1.5 Crore where Fund supported
by RBI is an user entered value. So find the rate of interest of all the Banks 
using dynamic method dispatch technique.*/

import java.util.Scanner;

class Bank {
    double ROI;

    void find_ROI() {
        System.out.println("Rate of Interest: " + ROI + "%");
    }
}

class HDFC extends Bank {
    double annual_profit;

    HDFC(double annual_profit) {
        this.annual_profit = annual_profit;
        ROI = (annual_profit / 1.5) * 100;
    }

    @Override
    void find_ROI() {
        System.out.println("Rate of Interest for HDFC Bank: " + ROI + "%");
    }
}

class ICICI extends Bank {
    double fund_RBI;

    ICICI(double fund_RBI) {
        this.fund_RBI = fund_RBI;
        ROI = (fund_RBI / 1.5) * 100;
    }

    @Override
    void find_ROI() {
        System.out.println("Rate of Interest for ICICI Bank: " + ROI + "%");
    }
}

public class l9q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Annual Profit for HDFC Bank: ");
        double annual_profit = sc.nextDouble();
        HDFC hdfc = new HDFC(annual_profit);

        System.out.println("Enter Fund supported by RBI for ICICI Bank: ");
        double fund_RBI = sc.nextDouble();
        ICICI icici = new ICICI(fund_RBI);

        Bank bank1 = new HDFC(annual_profit);
        Bank bank2 = new ICICI(fund_RBI);

        bank1.find_ROI();
        bank2.find_ROI();
    }
}
