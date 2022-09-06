import java.util.Scanner;
import java.lang.Math;

public class C2E20FinancialApplicationCalculateInterest
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interestrate = input.nextDouble();

		double interest = balance * (interestrate/1200);

		System.out.println("The interest is " + interest);
	}
}