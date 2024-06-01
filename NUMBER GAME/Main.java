import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random random=new Random();
		String PlayAgain;
		do
		{
			int number=random.nextInt(100)+1;
			int attempts=0;
			System.out.println("Guess the number between 1 and 100");
			while(attempts<10)
			{
				System.out.print("Make a guess: ");
				int guess=s.nextInt();
				attempts++;
				if(guess==number)
				{
					System.out.println("Well done! You guessed it right in "+attempts+"tries!");
					break;
				}
				else if(guess<number)
				{
					System.out.println("Oops! That's a bit low. Try a higher number.");
				}
				else
				{
					System.out.println("Oops! That's a bit high. Try a lower number.");
				}
			}
			if(attempts==10)
			{
				System.out.println("\"You've reached the maximum number of attempts. The correct number was: \" + number");
			}
			System.out.print("Do tou want to play again? (yes/no): ");
			PlayAgain=s.next();
		}while(PlayAgain.equalsIgnoreCase("yes"));
		s.close();

	}
}
	


