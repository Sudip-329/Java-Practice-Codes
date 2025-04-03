
import java.util.Scanner;

class Complex {
  private double real;
  private double imaginary;

  public Complex() {}

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public Complex sum(Complex other) {
    double newReal = this.real + other.real;
    double newImaginary = this.imaginary + other.imaginary;
    return new Complex(newReal, newImaginary);
  }

  public void swap(Complex other) {
    double tempReal = this.real;
    double tempImaginary = this.imaginary;
    this.real = other.real;
    this.imaginary = other.imaginary;
    other.real = tempReal;
    other.imaginary = tempImaginary;
  }

  public void print() {
    System.out.println(real + " + " + imaginary + "i");
  }
}

public class ComplexProgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the real part of the first complex number: ");
    double real1 = scanner.nextDouble();

    System.out.print("Enter the imaginary part of the first complex number: ");
    double imaginary1 = scanner.nextDouble();

    System.out.print("Enter the real part of the second complex number: ");
    double real2 = scanner.nextDouble();

    System.out.print("Enter the imaginary part of the second complex number: ");
    double imaginary2 = scanner.nextDouble();

    Complex c1 = new Complex(real1, imaginary1);
    Complex c2 = new Complex(real2, imaginary2);

    System.out.println("The first complex number is:");
    c1.print();
    System.out.println("The second complex number is:");
    c2.print();
    Complex sum = c1.sum(c2);
    System.out.println("The sum of the two complex numbers is:");
    sum.print();

    c1.swap(c2);
    System.out.println("After swapping, the first complex number is:");
    c1.print();
    System.out.println("After swapping, the second complex number is:");
    c2.print();
  }
}
