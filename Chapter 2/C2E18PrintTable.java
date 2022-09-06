import java.util.Scanner;
import java.lang.Math;

public class C2E18PrintTable
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println(" a  b  pow(a, b) ");

		for (int a = 1; a < 6; a++)
		{
			int b = a + 1;
			System.out.println(" " + a + "  " + b + "  " + Math.pow(a, b) );
		}
	}
}
