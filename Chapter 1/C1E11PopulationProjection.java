import java.util.Scanner;

public class C1E11PopulationProjection
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

		double year1 = population + birthsinyear - deathsinyear + immigrantsinyear;
		double year2 = year1 + birthsinyear - deathsinyear + immigrantsinyear;
		double year3 = year2 + birthsinyear - deathsinyear + immigrantsinyear;
		double year4 = year3 + birthsinyear - deathsinyear + immigrantsinyear;
		double year5 = year4 + birthsinyear - deathsinyear + immigrantsinyear;
		
		System.out.println("Year 1 : " + year1);
		System.out.println("Year 2 : " + year2);
		System.out.println("Year 3 : " + year3);
		System.out.println("Year 4 : " + year4);
		System.out.println("Year 5 : " + year5);
		
	}
}
		

		