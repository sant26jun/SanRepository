package Lab2;

import java.util.Scanner;

public class GenerateInvoice_2_1 {
	public static void main(String args[])
	{	
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Invoice Number:");
		int invoice_no=in.nextInt();

		Scanner in1= new Scanner(System.in);
		System.out.println("Enter the Item Number:");
		int item_no=in1.nextInt();
		
		Scanner in2= new Scanner(System.in);
		System.out.println("Enter the price:");
		double item_price=in2.nextDouble();
		
		Scanner in3= new Scanner(System.in);
		System.out.println("Enter the quantity:");
		double qty=in3.nextInt();
		
		Scanner in4= new Scanner(System.in);
		System.out.println("Enter the comments:");
		String comments=in4.next();
		
		Scanner in5= new Scanner(System.in);
		System.out.println("Enter the discount in percentage:");
		double discount=in5.nextInt();
		//	int discount=in5.nextInt();
		System.out.println("Invoice Number:"+invoice_no);
		System.out.println("Item Number:"+item_no);
		System.out.println("price:"+item_price);
		System.out.println("quantity:"+qty);
		System.out.println("comments:"+comments);
		
		double discountPrice=(item_price*qty) * (discount/100);
		
		double TotalAmount= (item_price*qty) - discountPrice;
		
		System.out.println("The discount Price is:"+discountPrice);
		System.out.println("The Total Amount is:"+TotalAmount);
		
	}
}
