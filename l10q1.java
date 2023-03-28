/*Illustrate the usage of abstract class with following Java classes-
1)An abstract class "student with data members as roll no, regno and an abstract
method course()
i)A subclass "Kitian" with course() method implementation*/

abstract class Student {
    int rollNo;
    int regNo;

    public Student(int rollNo, int regNo) 
    {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    public abstract void course();
}


class Kitian extends Student 
{
    public Kitian(int rollNo, int regNo) 
    {
        super(rollNo, regNo);
    }

    // Implementation of the abstract method "course()"
    public void course() 
    {
        System.out.println("Roll is : "+rollNo);
        System.out.println("Registration number is : "+regNo);
        System.out.println("I am a Kitian and I am studying Computer Science.");
    }
}


public class l10q1 {
    public static void main(String[] args) {
        Kitian k = new Kitian(21053329, 987654321);
        k.course();
    }
}