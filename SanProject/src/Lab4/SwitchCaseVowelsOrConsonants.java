package Lab4;

import java.util.Scanner;

public class SwitchCaseVowelsOrConsonants {
	
	public static void main(String args[])
	{	
		char ch='b';
		switch(ch)
		{
		   
		default:
				System.out.println("Consonant");
		   		break;
			case 'a' :
		   case 'e' :
		   case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : 
			   		System.out.println("Vowel");
			   		break;
		}//end of switch
	}
}