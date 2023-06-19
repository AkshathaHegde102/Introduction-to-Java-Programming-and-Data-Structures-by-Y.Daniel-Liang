import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class C3E14GameHeadsOrTails
{
	public static void main(String[] args) 
	{
	
		// Create a Scanner
		Scanner input = new Scanner(System.in);

        int min = 0;
        int max = 1;
        
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
	
		System.out.print("Guess 0 or 1! ");
        int guess = input.nextInt();

		if (guess == randomNum)
		{
			System.out.print(randomNum + " is correct");
		}
		else
		{
			System.out.print(guess + " is incorrect");
		}
	}
}
		