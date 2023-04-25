//Write a program in java to find no. of objects created out of a class using static moodifier.
public class l7q4 
{  
    static int count=0;  
    public static void main(String args[])  
    {  
        l7q4 c1=new l7q4();   
        c1.count();  
        l7q4 c2=new l7q4();  
        c2.count();  
        l7q4 c3=new l7q4();   
        c3.count();  
        System.out.println("Total Number of Objects created: "+count);  
    }  
 
    static void count()  
    {  
        count++;  
    }  
}  