import java.util.Scanner;
import java.lang.Math;

public class C2E2VolumeOfCylinder
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println(" Program to find volume of cylinder ");

		double area;
		double volume;
		//double pi = 3.145;

		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		area = radius*radius*Math.PI;
		volume = area*length;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}