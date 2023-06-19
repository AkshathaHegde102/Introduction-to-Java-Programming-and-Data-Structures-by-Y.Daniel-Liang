import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class C3E20ScienceWindTemp
{
	public static void main(String[] args) 
	{
	
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
        	System.out.print("Enter the temperature: ");
       	 	double t = input.nextDouble();

		System.out.print("Enter the wind speed: ");
		double v = input.nextDouble();

		if ((t > -58) && (t < 41) && (v > 2))
		{
      			double wct = 35.74 + (0.6215*t) - 35.75*Math.pow(v,0.16) + 0.4275*t*Math.pow(v,0.16);
		}
		
		else
        	System.out.print("Input is invalid.");
        	
	}
}