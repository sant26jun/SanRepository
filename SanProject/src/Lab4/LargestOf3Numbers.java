package Lab4;

public class LargestOf3Numbers {
	
	public static void main(String args[])
	{	
			
		 int x=80,y=100,z=130;
	if(x>y && x>z)
		 System.out.println("Largest is X: "+x);
	else if(y>z)			//else if(y>z && y>x)
	 System.out.println("Largest is Y: "+y);
	else
		System.out.println("Largest is Z "+z);
	}
}