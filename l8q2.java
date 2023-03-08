/*A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet
is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate
 the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.*/


import java.util.*;
class Dimen_2
{
    double len, width;
    double calculate2DSheetCost() 
    {
		Scanner inp=new Scanner(System.in);
        System.out.println("Enter the length and width: ");
        len=inp.nextDouble();
        width=inp.nextDouble();
        double cost=len*width*40;
        return cost;
	}
}

class Dimen_3 extends Dimen_2
{
    Double height;
    double calculate3DSheetCost() 
    {
		Scanner inp=new Scanner(System.in);
        System.out.println("Enter the length and width and Height: ");
        len=inp.nextDouble();
        width=inp.nextDouble();
        height=inp.nextDouble();
        double cost=(2*(len*width)+4*(width*height))*60;
        return cost;
	}
}

public class l8q2{
	public static void main(String[] args) {
		Dimen_3 obj = new Dimen_3();
        System.out.println("The cost of the 2D sheet is: "+obj.calculate2DSheetCost());
        System.out.println("The cost of the 3D sheet is: "+obj.calculate3DSheetCost());
	}
}