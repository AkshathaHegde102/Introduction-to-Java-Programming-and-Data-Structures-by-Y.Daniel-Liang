import java.util.Scanner;
import java.lang.Math;

public class C3E12PalindromeInteger
{
	public static void main(String[] args) 
	{
	
		// Create a Scanner
		Scanner input = new Scanner(System.in);
	
		int x = 0;
		System.out.print("Enter a three-digit integer: ");
		int num = input.nextInt();
		int n = num;

		for (int i = 0 ; i < 3 ; i++)
		{
			x = (x*10) + (n % 10);
			n = n/10;
		}

		if (num == x)
		{
			System.out.print(x + " is a palindrome");
		}
		else
		{
			System.out.print(x + " is not a palindrome");
		}
	}
}
		

		
