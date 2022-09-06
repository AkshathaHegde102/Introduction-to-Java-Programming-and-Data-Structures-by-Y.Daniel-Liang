import java.util.Scanner;
import java.lang.Math;

public class C2E23CostOfDriving
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
	
		System.out.print("Enter miles per gallon: : ");
		double miles = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();

		double x = distance/miles;
		double cost = x*price;

		System.out.print("The cost of driving is " + cost);
		
	}
}