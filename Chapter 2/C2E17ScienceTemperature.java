import java.util.Scanner;
import java.lang.Math;

public class C2E17ScienceTemperature
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:  ");
		double ta = input.nextDouble();

		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
		double v = input.nextDouble();

		double twc = 35.74 + (0.6215*ta) - (35.75*Math.pow(v, 0.16)) + (0.4275*ta*Math.pow(v, 0.16));
		
		System.out.println("The wind chill index is " + twc);

	}
}