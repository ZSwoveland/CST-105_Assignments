import java.util.Scanner;

public class Sum {
	// This is my own work.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5-Digit postive integers: ");

		int numbers = input.nextInt();
		int sum = 0;
		while (numbers > 0) {
			//gives remainder of the last digit of the 5-digit integer.
			//For example, 12345 comes to 1234.5.
			int add = numbers % 10;
			sum += add;
			//takes numbers and removes a digit so, 12345 becomes 1234 and so forth.
			//This repeats until numbers is less than 0.
			numbers /= 10;
		}

		System.out.println("The sum of the digits is " + sum);
		input.close();
	}

}
