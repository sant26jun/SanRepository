package Lab2;

import java.util.Scanner;

public class One_GenerateInvoice_Lab2 {
	public static void main(String args[])
	{	
		//int priceA,priceB,priceC;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Price of Item A:");
		int priceA=input.nextInt();
		
		Scanner input1= new Scanner(System.in);
		System.out.println("Enter the Price of Item B:");
		int priceB=input1.nextInt();
		
		Scanner input2= new Scanner(System.in);
		System.out.println("Enter the Price of Item C:");
		int priceC=input2.nextInt();
		
		Scanner input3= new Scanner(System.in);
		System.out.println("Enter the Quantity of Item A:");
		int qtyA=input3.nextInt();

		Scanner input4= new Scanner(System.in);
		System.out.println("Enter the Quantity of Item B:");
		int qtyB=input4.nextInt();
		
		Scanner input5= new Scanner(System.in);
		System.out.println("Enter the Quantity of Item C:");
		int qtyC=input5.nextInt();
		
		int ValA= (priceA * qtyA);

		int ValB= (priceB * qtyB);

		int ValC= (priceC * qtyC);
		
		double disA=(0.15*ValA),disB=(0.15*ValB),disC=(0.15*ValC);
		double stA=(0.02*ValA),stB=(0.02*ValB),stC=(0.02*ValC);
		
		//15% discount on all items + 2% service tax
		double TotalA=ValA-disA+stA;
		double TotalB=ValB-disB+stB;
		double TotalC=ValC-disC+stC;
		
		System.out.println("Actual Price of Item A: "+ ValA);
		System.out.println("Discount value of Item A: "+ disA);
		System.out.println("Service tax of Item A: "+ stA);
		System.out.println("Total Price of Item A after discount and including service tax is : "+ TotalA );
	
		System.out.println("Actual Price of Item B: "+ ValB);
		System.out.println("Discount value of Item B: "+ disB);
		System.out.println("Service tax of Item B: "+ stB);
		System.out.println("Total Price of Item B after discount and including service tax is : "+ TotalB);
	
		System.out.println("Actual Price of Item C: "+ ValC);
		System.out.println("Discount value of Item C: "+ disC);
		System.out.println("Service tax of Item C: "+ stC);
		System.out.println("Total Pric`e of Item C after discount and including service tax is : "+ TotalC );
	
		double GrandTotal=TotalA + TotalB + TotalC;
		System.out.println("Grand Total Price of 3 Items : "+ GrandTotal );
		
	}
}
