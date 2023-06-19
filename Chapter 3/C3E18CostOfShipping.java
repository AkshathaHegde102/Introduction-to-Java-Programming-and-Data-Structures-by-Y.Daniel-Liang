import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class C3E18CostOfShipping
{
	public static void main(String[] args) 
	{
	
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		
        	System.out.print("Enter weight: ");
       	 	double w = input.nextDouble();

		while(w <= 0)
		{
			System.out.println("Invalid input.");
			System.out.print("Enter weight: ");
       	 		w = input.nextDouble();
		}

      		double cost = 0;

        	if(w > 0 && w <=1)
            		cost = 3.5;
        	else if(w > 1 && w <=3)
            		cost = 5.5;
		else if(w > 3 && w <=10)
            		cost = 8.5;
		else if(w > 10 && w <=20)
            		cost = 10.5;
        	else
            		System.out.print("The package cannot be shipped.");

		System.out.print("The cost is: " + cost);


        	
	}
}