import java.util.Scanner;

public class C1E12AverageSpeedKilo
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.");

		double convert = 1.6;
		double miles = 24;
		double time = (((100*60)+35)/60)/60.0;
		double mph = miles/time;

		System.out.println("The miles per hour is  " + mph);
		
		double kmh = mph*1.6;

		System.out.println("The kilometers per hour is " + kmh);
	}
}
