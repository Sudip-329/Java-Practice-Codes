/*1. Write a Student class in Java with data members as Rollno Course and a method as register for
enrolling to a course. Write another class derived from Student having a method hostel-
request to request for hostel accommodation. Write the complete program to check the
inheritance of Kiitian object.  */

class Student {
    int rollno;
    String course;

    public void register(String c1) {
        course = c1;
        System.out.println("Enrolled in " + course);
    }
}

class Kiitian extends Student {
    public void hostelRequest() {
        System.out.println("Kindly allot 3 beded non AC room hostel accomodition!");
    }
}

public class l8q1 {
    public static void main(String[] args) {
        Kiitian obj = new Kiitian();
        obj.rollno = 21053329;
        obj.register("B-Tech in Computer Science Enginnering");
        obj.hostelRequest();
    }
}