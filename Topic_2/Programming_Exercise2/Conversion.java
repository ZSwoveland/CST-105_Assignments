import java.util.Scanner;

public class Conversion {
	// This is my own work. Only got the equations from the assignment.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Fahrenheit temperature: ");
		System.out.println("Enter a Celsius temperature: ");

		double numberF = input.nextDouble();
		double convertToCelsius = (numberF - 32) * (5.0 / 9);
		double numberC = input.nextDouble();
		double convertToFahrenheit = numberC * (9.0 / 5) + 32;

		System.out.println(numberF + "F" + " is equivalent to " + convertToCelsius + "C");
		System.out.println(numberC + "C" + " is equivalent to " + convertToFahrenheit + "F");
		input.close();
	}

}
