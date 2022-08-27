package Lab5;

public class DiplayPrimeTillNum {

	public static void main(String[] args) {
		int min=50,max=100;
		for (int j=min;j<max;j++) {
			
			CheckPrime(j);
		}
	}

	private static void CheckPrime(int j) {
		// TODO Auto-generated method stub
			boolean prime=true;
		for(int i=2;i<(j/2);i++) {
			if(j%i==0)
				prime=false;
				break;
		}
		if (prime) {
			System.out.println(j);
			//System.out.println("Number is Prime "+j);
		}
		else {
			//System.out.println("Number is NOT Prime "+j);
		}
		
	}
}
		
