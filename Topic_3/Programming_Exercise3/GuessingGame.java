import java.util.Scanner;
//This is my own work, Zachary Swoveland 
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generates a random integer between 1 to 10,000
		int guessingint = 1 + (int) (Math.random() * 10000);
		// Both parameters are for the range after the guess to give the user a better
		// chance of guessing the random integer
		int parameter1 = guessingint - (int) (Math.random() * 11);
		int parameter2 = guessingint + (int) (Math.random() * 11);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a guess between 1 and 10000:");

		int guess = input.nextInt();
		// Count helps count how many times the user has guess it starts at one and than
		// returns to zero once the loop begins
		int count = 1;
		// This is for when the guess the random number on the first attempt
		if (guess == guessingint) {
			System.out.println("You WIN. It took you " + count + " guesses."
					+ "\rThis was the number you guessed right " + guessingint);
		}
		// This makes the program loop until the user gets the random integer right
		while (guess != guessingint) {

			guess = input.nextInt();
			count++;
			// When the guess is greater than the random integer it produces lower
			if (guess > guessingint) {
				System.out.println("Enter a guess between " + parameter1 + " and " + guess + ":\rLower");
				// When the guess is less than the random integer it produces higher
			} else if (guess < guessingint) {
				System.out.println("Enter a guess between " + guess + " and " + parameter2 + ":\rHigher");
				// Count has to be minus 1 because the if statement in the very beginning was
				// the first attempt and count started at 1 and not 0
			} else if (guess == guessingint) {
				count -= 1;
				System.out.println("You WIN. It took you " + count + " guesses."
						+ "\rThis was the number you guessed right " + guessingint);
			}

		}
	}

}
