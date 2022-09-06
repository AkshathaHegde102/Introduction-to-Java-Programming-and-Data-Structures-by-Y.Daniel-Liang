import java.util.Scanner;

public class C2E14HealthApplicationComputingBMI
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();

		double BMI = (703 * weight) / (height * height);

		System.out.println("BMI is " + BMI);
	}
}