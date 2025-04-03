import java.util.Scanner;

class NotEligibleException extends Exception {
  public NotEligibleException(String message) 
  {
    super(message);
  }
}

class Person {
  private String name;
  private String aadhaar;
  private int age;
  private String contactNo;

  public Person(String name, String aadhaar, int age, String contactNo) throws NotEligibleException {
    if (age < 45) 
    {
      throw new NotEligibleException("Age should be 45 years old.");
    }
    this.name = name;
    this.aadhaar = aadhaar;
    this.age = age;
    this.contactNo = contactNo;
  }

  public String getName() {
    return name;
  }

  public String getAadhaar() {
    return aadhaar;
  }

  public int getAge() {
    return age;
  }

  public String getContactNo() {
    return contactNo;
  }
}

public class PersonDetails {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Your Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Aadhaar Number: ");
    String aadhaar = scanner.nextLine();

    System.out.print("Enter Your Age: ");
    int age = scanner.nextInt();

    System.out.print("Enter Contact Number: ");
    String contactNo = scanner.next();

    try 
    {
      Person person = new Person(name, aadhaar, age, contactNo);
      System.out.println("Person Details are : ");
      System.out.println("Name: " + person.getName());
      System.out.println("Aadhaar Number: " + person.getAadhaar());
      System.out.println("Age: " + person.getAge());
      System.out.println("Contact Number: " + person.getContactNo());
    } 
    catch (NotEligibleException e) 
    {
      System.out.println(e.getMessage());
    }
  }
}
