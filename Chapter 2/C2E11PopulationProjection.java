import java.util.Scanner;

public class C2E11PopulationProjection
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		double birth = 7;
		double death = 13;
		double immigrant = 45;
		double population = 312032486;
		double year = 365;
		
		double secondsinyear = 365*24*60*60;

		double birthsinyear = secondsinyear/7;
		double deathsinyear = secondsinyear/13;
		double immigrantsinyear = secondsinyear/45;

		System.out.println("Enter the number of years: ");
		int yearnumber = input.nextInt();
		
		for (int i = 0; i < yearnumber; i++)
		{
			double poulation = population + birthsinyear - deathsinyear + immigrantsinyear;
		}
		
		System.out.println("The population in " + yearnumber + " years is " + population);

	}
}