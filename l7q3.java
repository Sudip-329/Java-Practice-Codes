//Write a program in Java to find sum of each diagonal elements of an user entered 3X3 matrix of nos.


import java.util.Scanner;
public class l7q3{

    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);

        int a[][] = new int[3][3];

        int sum1=0,sum2=0;
        System.out.println("Enter the elements for 1st matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=scan.nextInt();
                if (i==j)
                    sum1=sum1+a[i][j];
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if ((i+j)==2)
                    sum2=sum2+a[i][j];
            }
        }

        System.out.println("The sum of the diagonals elements: "+sum1);
        System.out.println("The sum of the diagonals elements: "+sum2);
    }
}