import java.util.*;

class Fruit{
    String color;
    String name;
    public void fruitdetails(String name, String color){
        System.out.println("fruit name : "+name);
        System.out.println("fruit name : "+color);
    }
}

class Apple extends Fruit{
    String benefit = "Good for health.";
    public void printbenefit(){
        System.out.println("Fruit benefit is : "+benefit);
    }
}

public class Inheritance_basic{
    public static void main(String [] args)
    {
        Apple obj = new Apple();
        obj.fruitdetails("Mango","Green");
        obj.printbenefit();
    }
}