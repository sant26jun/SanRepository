package Lab1;

import java.util.Scanner;

public class One_PerimeterAndAreaOfRectangle_Lab1 {
	
	public static void main(String args[])
	{	
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Length:");
		int length=in.nextInt();
		System.out.println("Enter the Breadth:");
		int breadth=in.nextInt();;
		
		int area= length * breadth;
				
		int pm= 2 * (length * breadth);
		
		System.out.println("Length of the Rectangle is: "+ length);
		System.out.println("Breadth of the Rectangle is: "+ breadth);
		System.out.println("Area of the Rectangle is: "+ area+" Square Meters");
	
		System.out.println("Perimeter of the Rectangle is: "+ pm+" Meters");
	
	}

}
