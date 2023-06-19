import java.util.Scanner;
import java.lang.Math;

public class C3E11NumberofDays
{
	public static void main(String[] args) 
	{
	
		// Create a Scanner
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the month: ");
		int month = input.nextInt();

		System.out.print("Enter the year: ");
		int year = input.nextInt();

		int num = 0;
		String mname = "";

		if (month == 1 || month == 3 || month == 5 || month == 7 ||
			month == 8 || month == 10 || month == 12)
		{
			num = 31;	
		}
		else
		{	
			num = 30;
			if (year % 4 == 0)
			{
				if (month == 2)
				{
					num = 29;
				}
			}	
			else
			{
				if (month == 2)
				{
					num = 28;
				}
			}
		}
		
		if (month == 1)
		{
			mname = "January";
		}
		else if (month == 2)
		{
			mname = "February";
		}
		else if (month == 3)
		{
			mname = "March";
		}
		else if (month == 4)
		{
			mname = "April";
		}
		else if (month == 5)
		{
			mname = "May";
		}
		else if (month == 6)
		{
			mname = "June";
		}
		else if (month == 7)
		{
			mname = "July";
		}
		else if (month == 8)
		{
			mname = "August";
		}
		else if (month == 9)
		{
			mname = "September";
		}
		else if (month == 10)
		{
			mname = "October";
		}
		else if (month == 11)
		{
			mname = "November";
		}
		else if (month == 12)
		{
			mname = "December";
		}
		
		System.out.println(mname + " " + year + " has " + num + " days");
		
	}
}
		
		

		