import java.util.Scanner;

public class C2E12PhysicsFindingRunwayLength
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();

		double length = (v*v) / (2.0*a);

		System.out.println("The minimum runway length for this airplane is " + length);
	}
}