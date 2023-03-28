/*Define an interface Motor with a data member-capacity and two methods such as run() and consume().
Define a Java class Washing machine' which implements this interface and write the code to check the
value of the Interface data member through an object of the class.*/

interface Motor {
    int capacity = 10; // default capacity of the motor

    void run();//methods
    void consume();//methods
}

class WashingMachine implements Motor {
    // Implementation of the "run()" method
    public void run() {
        System.out.println("Washing machine is running.");
    }

    // Implementation of the "consume()" method
    public void consume() 
    {
        System.out.println("Washing machine is consuming electricity.");
    }
}

public class l10q2
{
    public static void main(String[] args) {
        // Create a "WashingMachine" object
        WashingMachine wm = new WashingMachine();

        // Check the value of the interface data member "capacity" through the "WashingMachine" object
        System.out.println("The capacity of the washing machine is " + wm.capacity + " liters.");
    }
}
