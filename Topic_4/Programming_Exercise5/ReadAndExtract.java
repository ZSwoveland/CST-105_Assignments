import java.util.Scanner;
import java.io.*;
//This is my own work, Zachary Swoveland.
//4/29/18
//CST-105
public class ReadAndExtract {
	
	public static void printArray(char[][] b) {
		//prints 2d array in row major order
		for(int row = 0; row < b.length; row++) {
			for(int column = 0; column < b[0].length; column++) {
				System.out.print(b[row][column]);
			}
			System.out.println();
		}
	}
	public static void initialize(char[][] c) {
		//prints @ to the array when not filled with the text from file
		for(int row = 0; row < c.length; row++) {
			for(int column = 0; column < c[0].length; column++) {
				c[row][column] = '@';
			}
			
		}
	}
	
	public static void convert(char[][] con) {
		int x = 0;
		int y = 0;
		String hold = "";
		//reads the columns to output it to one line of code
		while(x < 20 && y < 45){
			if(con[x][y] == '_' ) {
			
				hold = hold + " ";
				x++;
			}else if(con[x][y] == '@'){
				hold = hold + "";
				x++;
			}else {
				hold = hold + Character.toString(con[x][y]);
				x++;
			}
			if(x == 19) {
				x = 0;
				y++;
	
				
			}
			
		}
		System.out.print(hold);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File textFile = new File("ReadMe.txt");
		
		try {
			//reads the text file
			Scanner input = new Scanner(textFile);
			char[][] result = new char[20][45];
			String line = "";
			while(input.hasNextLine()) {
				line = input.nextLine();
				int count = 0;
				char letter = '@';
				initialize(result);
				//prints out one line per array
				//could not figure out how to put lines together in array
					for(int row = 0; row < result.length; row++) {
						for(int column = 0; column < result[row].length; column++) {
							if(line.length() > count) {
								letter = line.charAt(count);
								
							}
							else {
								
								break;
							}
							if(letter != ' ') {
								result[row][column] = letter;
								
							}else {
								result[row][column] = '_';
								
							}
							count++;
						}
					}
					
					printArray(result);
					System.out.println();
					convert(result);
					System.out.println();
					System.out.println();
					
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
