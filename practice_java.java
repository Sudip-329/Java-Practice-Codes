class practice_java{

int x=0;

static int y=0; 
practice_java()
{
    x++;
    y++;
System.out.println(x+y);
}

public static void main(String args[]){

practice_java cl=new practice_java(); 
practice_java c2=new practice_java();

practice_java c3=new practice_java();
}
}







*/Create an abstract class Acpractice_java with the following details:

Data Members: balance, acpractice_javaNumber,acpractice_javaHolderName, address  Methods: withdraw() abstract, deposit()
 - abstract,

display() to show the balance of the acpractice_java number

Create subclass of this SavingAcpractice_java and add the following details: Data Members: rateOfInterest

Methods: calculate Amount(), display() to display rate of interest with new balanced full acpractice_java holder details

Create another subclass of the Acpractice_java class, i.e.

CurrentAcpractice_java with the following:

Data Members: overdraftl.imit

Methods: display) to show overdraft limit along with the full acpractice_java holder details Create objects of these two classes and call their methods.

Use appropriate constructors.

abstract class Acpractice_java {
    protected double balance;
    protected int acpractice_javaNumber;
    protected String acpractice_javaHolderName;
    protected String address;

    public Acpractice_java(double balance, int acpractice_javaNumber, String acpractice_javaHolderName, String address) {
        this.balance = balance;
        this.acpractice_javaNumber = acpractice_javaNumber;
        this.acpractice_javaHolderName = acpractice_javaHolderName;
        this.address = address;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    public void display() {
        System.out.println("Acpractice_java Number: " + acpractice_javaNumber);
        System.out.println("Acpractice_java Holder Name: " + acpractice_javaHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingAcpractice_java extends Acpractice_java {
    private double rateOfInterest;

    public SavingAcpractice_java(double balance, int acpractice_javaNumber, String acpractice_javaHolderName, String address, double rateOfInterest) {
        super(balance, acpractice_javaNumber, acpractice_javaHolderName, address);
        this.rateOfInterest = rateOfInterest;
    }

    public void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
    }

    public void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class CurrentAcpractice_java extends Acpractice_java {
    private double overdraftLimit;

    public CurrentAcpractice_java(double balance, int acpractice_javaNumber, String acpractice_javaHolderName, String address, double overdraftLimit) {
        super(balance, acpractice_javaNumber, acpractice_javaHolderName, address);
        this.overdraftLimit = overdraftLimit;
    }

    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Withdrawal not allowed due to overdraft limit.");
        } 
        else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class practice_java {
    public static void main(String[] args) {
        SavingAcpractice_java savingAcpractice_java = new SavingAcpractice_java(10000, 1001, "John Doe", "123 St.", 5.0);
        savingAcpractice_java.deposit(5000);
        savingAcpractice_java.calculateAmount();
        savingAcpractice_java.display();

        CurrentAcpractice_java currentAcpractice_java = new CurrentAcpractice_java(5000, 2001, "Jane Doe", "456 Elm St.", 2000);
        currentAcpractice_java.deposit(1000);
        currentAcpractice_java.withdraw(8000);
        currentAcpractice_java.display();
    }
}




/*Write a java program containing an abstract class Shape with a method called volume(). 
The Shape class will have child classes as Sphere and Cube which will override the methods 
and display the area accordingly. 

abstract class Shape {
    public abstract void volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    public void volume() {
        double vol = (4 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere is: " + vol);
    }
}

class Cube extends Shape {
    double side;

    Cube(double s) {
        side = s;
    }

    public void volume() {
        double vol = Math.pow(side, 3);
        System.out.println("Volume of Cube is: " + vol);
    }
}

public class practice_java {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(5.0);
        s1.volume();

        Cube s2 = new Cube(4.0);
        s2.volume();
    }
}



/*class practice_java{   //no output
    void practice_java(){
        System.out.println("In base");
    }
    public static void main (String a[])
    {
        practice_java b= new practice_java();
    }

}*/



/*class practice_java{
public static void main (String args[])

{ 
    String[] argh = {"x","y","z"}; 
    args=argh;
    for (int i=0;i<args.length; i++)
    { 
        System.out.println(args[i]);

    }
}
}*/



/*Write a program in java to create an abstract class Figure having abstract method area(),
and data members length, breadth? Derive classes Triangle, Rectangle having member function area()
and find area of triangle and rectangle by function overriding concept. [Note: subclasses do not 
contain any data members].
import java.util.Scanner;

abstract class Figure {
    double length;
    double breadth;

    // Abstract method
    abstract double area();
}

// Triangle subclass
class Triangle extends Figure {
    // Implementation of area() method for Triangle
    double area() {
        return 0.5 * length * breadth;
    }
}

// Rectangle subclass
class Rectangle extends Figure {
    // Implementation of area() method for Rectangle
    double area() {
        return length * breadth;
    }
}

// practice_java class
public class practice_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Triangle object and calculate area
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        Figure triangle = new Triangle();
        triangle.length = base;
        triangle.breadth = height;
        double triangleArea = triangle.area();
        System.out.println("Area of triangle: " + triangleArea);

        // Create Rectangle object and calculate area
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Figure rectangle = new Rectangle();
        rectangle.length = length;
        rectangle.breadth = breadth;
        double rectangleArea = rectangle.area();
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}
*/




/*Define a class practice_java having data members: Name. deptName, basicSalary and UID and member 
functions: geidetails() and displaydetails().The rules for the salary calculation are as follows 
Earnings basic +DA(125% of basic) +HRA(15% of basic) Deduct 12% of basic Net Salary Earnings - Deduct
Write a program in java to print salary slip for at least three employees.
import java.util.Scanner;

public class practice_java {
    // Data members
    String name;
    String deptName;
    double basicSalary;
    int UID;

    // Constructor
    /*public practice_java(String name, String deptName, double basicSalary, int UID) {
        this.name = name;
        this.deptName = deptName;
        this.basicSalary = basicSalary;
        this.UID = UID;
    }

    // Member function to get employee details
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter department name: ");
        deptName = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        basicSalary = scanner.nextDouble();
        System.out.print("Enter UID: ");
        UID = scanner.nextInt();
    }

    // Member function to display employee details and salary slip
    public void displayDetails() {
        double DA = 1.25 * basicSalary;
        double HRA = 0.15 * basicSalary;
        double earnings = basicSalary + DA + HRA;
        double deduction = 0.12 * basicSalary;
        double netSalary = earnings - deduction;

        System.out.println("practice_java details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("UID: " + UID);
        System.out.println("Earnings: " + earnings);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("-------------------------------");
    }

    // practice_java method to create objects and call methods
    public static void main(String[] args) {
        // Create employee objects
        /*practice_java employee1 = new practice_java("John", "Sales", 20000, 1001);
        practice_java employee2 = new practice_java("Jane", "Marketing", 25000, 1002);
        practice_java employee3 = new practice_java("Jack", "Finance", 30000, 1003);
        
        for(int i=0; i<3; i++)
        {
            practice_java a = new practice_java();
            a.getDetails();
            a.displayDetails();
        }
        // Display employee details and salary slip
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();*
    }
}









/*class practice_java{

public static void main(String x[] ){

int z[][]={{1,2,3,4},{1,2,3}};
    System.out.println(z[1].length+" " + z.length);
}

}




/*

public class practice_java{
        static int j;
        static void methodA(int i){

        boolean b;
        do{
            b=i<10 | methodB(4);
            b=i<10 || methodB(8);
        }while (!b);
    }
    

static boolean methodB(int i)
{
    j+=i;
    return true;
}
public static void main(String[] args)
{
    methodA(0);
    System.out.println("j="+j);
    }
}





/*class practice_java{
public static void main(String[] args){

    int x = 11 & 9;
    int y = x ^ 3;     // ans 0
  System.out.println(y/12);
}
}


/*class practice_java{
    public static void main (String ar[]){
    int i=40;
    char c='h';
    byte b=20;
    float price= 60.95f;
    double d = 40.74884755756;
    System.out.println("Value of integer is :"+i);
    System.out.println("Value of character is :"+c);
    System.out.println("Value of byte is :"+b);
    System.out.println("Value of float is :"+price);
    System.out.println("Value of double is :"+d);
    }
    }*/


/*class practice_java{
    public static void main (String arg[]){
    int k=5, i=10;
        switch(i-k)
        {
        case 3: 
        System.out.println("hhh");
        case 5:
        System.out.println("hi hello");
        break;
        case 7:
        System.out.println("ok");
        default:
        System.out.println("KIIT");
        }

        System.out.println("End");
    }
}*/



/*class practice_java
{ 
    public void main(String [] args)
    {
        int a=20;
        byte b= 6;
        a= a+4;
        b= b*2;  // error
        System.out.println ("value of a is : " +a);
        System.out.println ("value of b is : " +b);
    }
    
}*/


/*public class practice_java{
    public void someOutermethod(){
        

    }
    public class Inner{}
    public static void main(String [] args)
    {
        practice_java ot = new practice_java();
        new Outer.Inner();

    }
}*/

/*Write a program in java to create abstract class Figure having abstract methodarea(), and data 
members length, breadth? Derive classes Triangle, Rectangle havingmember function area() and find
area of triangle and rectangle by functionoverriding concept? [Note: subclasses does not contain 
any data members].

abstract class Figure {
    protected double length; 
    protected double breadth;
    
    public Figure(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }  
    public abstract double area();
}

// Define the subclass Triangle
class Triangle extends Figure {
    public Triangle(double length, double breadth) 
    {
        super(length, breadth);
    }
    // Override the area method to calculate the area of a triangle
    public double area() 
    {
        return (length * breadth) / 2;
    }
    public void putdata(boolean x){
        System.out.println("bool");
    }
}

// Define the subclass Rectangle
class Rectangle extends Figure {
    public Rectangle(double length, double breadth) 
    {
        super(length, breadth);
    }
    
    // Override the area method to calculate the area of a rectangle
    public double area() 
    {
        return length * breadth;
    }
}

// practice_java class to test the program
public class practice_java {
    public static void main(String[] args) 
    {
        // Create a Triangle object and calculate its area
        Triangle tri = new Triangle(5.0, 10.0);
        double triArea = tri.area();
        tri.putdata(false);
        System.out.println("The area of the triangle is " + triArea);
        
        // Create a Rectangle object and calculate its area
        Rectangle rect = new Rectangle(5.0, 10.0);
        double rectArea = rect.area();
        System.out.println("The area of the rectangle is " + rectArea);
    }
}*/













/*Write a program in java to create a class student having data members roll, name, branch, section,
 3 subject marks, University and member functions getdata(), putdata(), total(), average(). Display
  information of atleast three students in the
university by making use of the member functions. 

import java.util.Scanner;

public class Student {
    int roll;
    String name;
    String branch;
    String section;
    int[] marks = new int[3];
    String university;

    // Member function to get student data
    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roll: ");
        this.roll = input.nextInt();
        System.out.print("Enter Name: ");
        input.nextLine(); // consume the newline character left by nextInt()
        this.name = input.nextLine();
        System.out.print("Enter Branch: ");
        this.branch = input.nextLine();
        System.out.print("Enter Section: ");
        this.section = input.nextLine();
        System.out.print("Enter University: ");
        this.university = input.nextLine();
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            this.marks[i] = input.nextInt();
        }
    }

    // Member function to display student data
    public void putData() {
        System.out.println("Roll: " + this.roll);
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Section: " + this.section);
        System.out.println("University: " + this.university);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + this.marks[i]);
        }
        System.out.println("Total Marks: " + this.total());
        System.out.println("Average Marks: " + this.average());
        System.out.println();
    }

    // Member function to calculate total marks
    int total() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }

    // Member function to calculate average marks
    double average() {
        return (double) total() / marks.length;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter data for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getData();
        }
        System.out.println("Student Information:");
        for (int i = 0; i < students.length; i++) {
            students[i].putData();
        }
    }
}

*/
