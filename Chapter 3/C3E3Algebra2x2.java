import java.util.Scanner;
import java.lang.Math;

public class C3E3Algebra2x2
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Crammers rule equation : ");
		System.out.println(" ax + by = e ");
		System.out.println(" cx + dy = f ");
		System.out.println("Enter a, b, c, d, e, f in order : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		if (((a*d)-(b*c)) == 0)
		{
			System.out.println("The equation has no solution.");
		}
		else
		{
			double x = (((e*d)-(b*f))/((a*d)-(b*c)));
			double y = (((a*f)-(e*c))/((a*d)-(b*c)));
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
		}
		
	}
}