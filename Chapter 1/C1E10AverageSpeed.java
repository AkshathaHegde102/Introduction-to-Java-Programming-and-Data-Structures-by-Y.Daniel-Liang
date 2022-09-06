import java.util.Scanner;

public class C1E10AverageSpeed
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println("Assume a runner runs at 14 kilometers in 45 minutes and 30 seconds.");

		double convert = 1.6;
		double km = 14;
		double time = 45.5/60;
		double kmh = km/time;

		System.out.println("The kilometers per hour is  " + kmh);
		
		double miles = kmh/1.6;

		System.out.println("The miles per hour is " + miles);
	}
}

		
	
		