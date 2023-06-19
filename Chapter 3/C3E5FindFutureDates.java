import java.util.Scanner;
import java.lang.Math;

public class C3E5FindFutureDates
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		//int i = (int)(System.currentTimeMillis() % 12) + 1;

		System.out.print("Enter today’s day: ");
		int day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int num = input.nextInt();

		String today = null;
		String future = null;

		if (day == 0)
		{
			today = "Sunday";
		}
		else if (day == 1)
		{
			today = "Monday";
		}
		else if (day == 2)
		{
			today = "Tuesday";
		}
		else if (day == 3)
		{
			today = "Wednesday";
		}
		else if (day == 4)
		{
			today = "Thursday";
		}
		else if (day == 5)
		{
			today = "Friday";
		}
		else if (day == 6)
		{
			today = "Saturday";
		}

		if (num == 0)
		{
			future = "Sunday";
		}
		else if (num == 1)
		{
			future = "Monday";
		}
		else if (num == 2)
		{
			future = "Tuesday";
		}
		else if (num == 3)
		{
			future = "Wednesday";
		}
		else if (num == 4)
		{
			future = "Thursday";
		}
		else if (num == 5)
		{
			future = "Friday";
		}
		else if (num == 6)
		{
			future = "Saturday";
		}

		System.out.print("Today is " + today + " and the future day is " + future);
	}
}