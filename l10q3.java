/*Define an interface with three methods - earings(),deductions() and bonus) and define a Java 
class Manager which uses this interface without implementing bonus() method. Also define another 
Java class 'Substaff which extends from Manager class and implements bonus() method. Write the 
complete program to find out earnings, deduction and bonus of a substaff with basic salary amount 
entered by the user as per the following guidelines -earnings basic+ DA (80% of basic) + HRA (15% 
of basic) deduction PF-12% of basic bonus 50% of basic */

interface Staff
{ 
    public void earnings(); 
    public void deductions(); 
    public void bonus();
}
    
class Manager implements Staff 
{ 
    private int earnings, deductions; 
    Manager(int basic_salary)
    { 
        double da = (0.8*basic_salary); 
        double hra = (0.15*basic_salary); 
        this.earnings = (int)(basic_salary + da + hra); 
        this.deductions = (int)(0.12*basic_salary); 
    } 
    public void earnings()
    { 
        System.out.println("The total earnings is: "+this.earnings); 
    } 
    public void deductions()
    { 
        System.out.println("The total deduction is: "+this.deductions); 
    } 
    public void bonus()
    { 
        //Empty method
    } 
}

class SubStaff extends Manager 
{ 
    int bonus; 
    SubStaff(int basic_salary)
    { 
        super(basic_salary); 
        this.bonus = (int)(0.50 * basic_salary); 
    }
    public void bonus() 
    { 
        System.out.println("The bonus is: "+this.bonus); 
    } 
} 

public class l10q3
{
    public static void main(String[] args) 
    { 
        SubStaff substaff = new SubStaff(25000); 
        substaff.earnings(); 
        substaff.deductions(); 
        substaff.bonus(); 
    } 
}