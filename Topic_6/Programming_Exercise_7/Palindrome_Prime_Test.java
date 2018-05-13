//This my own work, Zachary Swoveland
//Zachary Swoveland
//CST-105
//5/13/18

public class Palindrome_Prime_Test {

	public static boolean primeNumberTest(int loop) {
		boolean isPrime = true;
		//checks if number us prime or not
		for (int count = 2; count <= loop; count++) {
			if (loop == count) {
				isPrime = true;

			} else if (loop % count == 0) {
				isPrime = false;
				break;
			}
		}
		//return boolean
		return isPrime;
	}

	public static boolean palindromeNumberTest(int count) {
		boolean isPalindrome = true;
		int compare = count;
		int digitPlace = 0;
		int reverse = 0;
		//put number in reverse order to compare it with actual number
		while (count > 0) {
			digitPlace = count % 10;
			count /= 10;
			reverse = reverse * 10 + digitPlace;
		}
		//determines if it is a palindrome or not
		if (reverse == compare) {
			isPalindrome = true;

		} else {
			isPalindrome = false;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loops 100,000 times to test 100,000 integers with the other two methods
		for (int number = 2; number < 100000; number++) {
			primeNumberTest(number);
			palindromeNumberTest(number);
			if (primeNumberTest(number) == true && palindromeNumberTest(number) == true) {
				System.out.println(number + " is a palindromic prime number");
			}
		}
	}

}
