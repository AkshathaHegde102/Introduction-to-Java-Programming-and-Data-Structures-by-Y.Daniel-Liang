import java.util.Scanner;
import java.lang.Math;

public class C3E1AlgebraSolveQuadraticEquations
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double disc = (b*b) - (4*a*c);

		double r1 = (-b + Math.pow(disc, 0.5)) / (2*a);

		double r2 = (-b - Math.pow(disc, 0.5)) / (2*a);
		
		if (disc == 0)
		{
			System.out.print("The equation has one root " + r1);
		}
		else if (disc > 0)
		{
			System.out.print("The equation has two root " + r1 + " and " + r2);
		}
		else
		{
			System.out.print("The equation has no real roots");
		}
	}
}