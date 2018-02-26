/**
 * If you sold more than 500,000 goods then you get a bonus of $10,000!
 * Or else you get $0 because you under-sold. Be careful of where you put
 * your scanner inputs and your initial values. This is only a one-way if statement. If 
 * you sold below the 500,000 goods then the program terminates
 */

import java.util.Scanner;

public class BasicIfStatement {

	public static void main(String[] args) {
				
		int bonus = 0; // Go ahead and declare and initialize bonus, just cuz
		Scanner input = new Scanner(System.in); //Get ready for input
		System.out.print("How many goods did you manage to sell? : "); //Prompt user for input
		int goodsSold = input.nextInt(); // Declaring the input as int goodsSold
		
		
		if (goodsSold > 500000) { //If the amount of goods you sold is true for greater than 500,00
			bonus = 10000; // then you add a value to bonus!
			System.out.println("Congratulations! You get a bonus of $" + bonus); //Display bonus
			/**Make sure you keep all components that pertain to the if statment
			 * within its corresponding if-statment {} curly brackets
			 */
		}
	}
}