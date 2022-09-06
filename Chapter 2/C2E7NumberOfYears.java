import java.util.Scanner;

public class C2E7NumberOfYears
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		double minutes = input.nextDouble();

		double hours = minutes/60.0;
		double days = hours/24.0;
		double years = days/365;
		double remdays = days%365;
		
		System.out.println(minutes + " minutes is approximately " + (int)years + " years and " +
					 + (int)remdays + " days");
	}
}