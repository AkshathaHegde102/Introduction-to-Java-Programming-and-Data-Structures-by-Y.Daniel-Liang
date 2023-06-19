import java.util.Scanner;
import java.lang.Math;

public class C3E9BusinessCheck
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int  ISBN = input.nextInt();
		
		int isbn = ISBN;
		
		int d9 = ISBN % 10;
		ISBN = ISBN / 10;
		int d8 = ISBN % 10;
		ISBN = ISBN / 10;
		int d7 = ISBN % 10;
		ISBN = ISBN / 10;
		int d6 = ISBN % 10;
		ISBN = ISBN / 10;
		int d5 = ISBN % 10;
		ISBN = ISBN / 10;
		int d4 = ISBN % 10;
		ISBN = ISBN / 10;
		int d3 = ISBN % 10;
		ISBN = ISBN / 10;
		int d2 = ISBN % 10;
		ISBN = ISBN / 10;
		int d1 = ISBN % 10;
		ISBN = ISBN / 10;

		int checksum = ((d1*1) + (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d6*6) + (d7*7) + (d8*8) + (d9*9))%11; 
		
		if (checksum == 10)
		{
			System.out.print("The ISBN-10 number is " + isbn + "X");
		}
		else
		{
			System.out.print("The ISBN-10 number is " + isbn + checksum);
		}
	}
}

		