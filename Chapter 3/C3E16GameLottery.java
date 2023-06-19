import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class C3E16GameLottery
{
	public static void main(String[] args) 
	{
	
		// Create a Scanner
		Scanner input = new Scanner(System.in);

        int min = 0;
        int max = 2;
        
        int computer = ThreadLocalRandom.current().nextInt(min, max + 1);

        string computermove = "";

        if(computer == 0)
            computermove = "scissor";
        else if(computer == 1)
            computermove = "rock";
        else
            computermove = "paper";
	
		System.out.print("scissor (0), rock (1), paper (2): ");
        int you = input.nextInt();

        string youmove = "";

        if(you == 0)
            youmove = "scissor";
        else if(you == 1)
            youmove = "rock";
        else
            youmove = "paper";

        
        if((computer == 2 && you == 0) || (you > computer))
            println("The computer is " + computer + ". You are " + you + ". You won");
        else println("The computer is " + computer + ". You are " + you + ". You lost");
	}
}
		