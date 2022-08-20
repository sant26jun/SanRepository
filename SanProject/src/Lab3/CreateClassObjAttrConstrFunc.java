package Lab3;

public class CreateClassObjAttrConstrFunc {

	int x;
	CreateClassObjAttrConstrFunc()
	{
		x=0;
		System.out.println("Constructor Called - The value of X is: "+x);
	}
	
	public void setX(int x) {
		this.x = x;
		System.out.println("setX(num) Called - The value of X is: "+x);
	}

	public int getX() {
		return x;
	}

	public int Add(int y) {
		x=x+y;
		System.out.println("Add(num) Called");
		return x;
	}
public static void main(String args[])
{	
	CreateClassObjAttrConstrFunc obj= new CreateClassObjAttrConstrFunc();
	//constructor is called
	//setX - sets value of x to 20
	obj.setX(20);
	//getX - value of x is printed 
	System.out.println("getX() is called - The value of X is: "+obj.getX());
	System.out.println("Add(num) is called - The value of X is: "+obj.Add(10));
	System.out.println("getX(num) is called - The value of X is: "+obj.getX());
	
}
}