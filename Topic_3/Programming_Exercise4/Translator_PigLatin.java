import java.io.*;
import java.util.Scanner;
//This is my own work, Zachary Swoveland.
public class Translator_PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Input.txt");
		try {
			Scanner text = new Scanner(file);

			while (text.hasNextLine()) {
				String line = text.nextLine();
				// Splits the line of text from one string to only the single words seperated by
				// spaces
				String[] split = line.split(" ");
				// Holds all the values for the the processes
				char vowel;
				int move, length;
				String leftSide, rightSide;
				// Processing splitting the text file into single words
				for (String word : split) {
					// Holds original word
					String trueWord = word;
					length = word.length();
					for (move = 0; move < length; move++) {
						// makes it stop at each vowel to keep the substring count to help move
						// consonants to the back of the word
						vowel = word.charAt(move);
						// stops at vowels to seperate the words into piglatin

						if (vowel == 'a' || vowel == 'A' || vowel == 'e' || vowel == 'E' || vowel == 'i' || vowel == 'I'
								|| vowel == 'o' || vowel == 'O' || vowel == 'u' || vowel == 'U') {
							//This is for the vowel rule in piglatin each vowel just ends in way
							if (word.startsWith("A") || word.startsWith("a") || word.startsWith("E")
									|| word.startsWith("e") || word.startsWith("I") || word.startsWith("i")
									|| word.startsWith("O") || word.startsWith("o") || word.startsWith("U")
									|| word.startsWith("u")) {

								word += "W";
							}
							break;
						}

					}
					//Moves consonant to the back of the word
					leftSide = word.substring(0, move);
					//Moves the right side to the front of the word
					rightSide = word.substring(move);
					System.out.println(trueWord + " " + rightSide.toUpperCase() + leftSide.toUpperCase() + "AY");
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
