import java.util.Scanner;

public class C2E13FinancialApplicationCompoundValue
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the monthly saving amount: ");
		double saving = input.nextDouble();

		double intrestrate = 5;
		double monthlyintrestrate = (5/saving)/12;

		saving = saving * (1 + monthlyintrestrate);

		for (int i = 1; i < 6; i++)
		{
			saving = (100 + saving) * (1 + monthlyintrestrate);
		}

		System.out.println("After the sixth month, the account value is " + saving);
	}		
}		

		