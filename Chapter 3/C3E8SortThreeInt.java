import java.util.Scanner;
import java.lang.Math;

public class C3E8SortThreeInt
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter three integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if ((a > b) && (a > c)) 
		{
			if (b > c)
			{
				System.out.print(a + " " + b + " " + c);
			}
			else
			{
				System.out.print(a + " " + c + " " + b);
			}
		}
		if ((b > a) && (b > c)) 
		{
			if (a > c)
			{
				System.out.print(b + " " + a + " " + c);
			}
			else
			{
				System.out.print(b + " " + c + " " + a);
			}
		}
		if ((c > a) && (c > b)) 
		{
			if (a > b)
			{
				System.out.print(c + " " + a + " " + b);
			}
			else
			{
				System.out.print(c + " " + b + " " + a);
			}
		}
	}
}
	