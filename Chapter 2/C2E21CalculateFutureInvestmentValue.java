import java.util.Scanner;
import java.lang.Math;

public class C2E21CalculateFutureInvestmentValue
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.println("Enter annual interest rate in percentage: ");
		double InterestRate = input.nextDouble();

		double monthlyInterestRate = InterestRate/12;

		System.out.println("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),(numberOfYears*12));

		System.out.println("Future value is " + futureInvestmentValue);

	}
}