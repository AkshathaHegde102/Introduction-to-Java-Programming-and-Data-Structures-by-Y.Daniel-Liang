import java.util.Scanner;
import java.util.Scanner;

public class C1E8AreaAndPerimeterCircle
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Area and Perimeter Circle");
		
		double area;
		double perimeter;
		//double radius;
		
		System.out.println("Enter the radius :");
		double radius = input.nextDouble();
		
		perimeter = 2 * radius * 3.14;
		area = radius * radius * 3.14;

		System.out.println("Perimeter :" + perimeter);
		System.out.println("Area :" + area);
		
	}
}