import java.util.Scanner;

public class C2E1ConvertCToF
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println("Program to Convert Celsius to Fahrenheit");

		System.out.println("Enter a degree in Celsius: ");
		double C = input.nextDouble();

		double F = ((9.0/5.0)*C)+32;

		System.out.println(C + " Celsius is " + F + " Fahrenheit");
	}
}

		