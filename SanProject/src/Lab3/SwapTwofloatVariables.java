package Lab3;

public class SwapTwofloatVariables {

	static float x=10.45098f,y=20.23432f;

	public static void main(String args[])
	{	
	System.out.println("Numbers before swapping are: "+"X:"+x+" and Y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
	System.out.println("Numbers after swapping are: "+"X:"+x+" and Y:"+y);
	}
}
