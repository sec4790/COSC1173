/**
 * This is a continuation of the basic if statment
 * except this time if you sold less than 500,00 goods then
 * you get a printed message for that condition
 * @author CrabbyTrees
 *
 */
import java.util.Scanner;
public class BasicIfElseStatement {

	public static void main(String[] args) {
	
		int bonus = 10000; //declare and initialize bonus
		Scanner input = new Scanner(System.in); //bring on in the scanna
		System.out.print("How many goods did you manage to sell? : ");
		int goodsSold = input.nextInt(); //initialize goodsSold//Ask user to input value
/* If they managed to bring in over 500,000 then they will be awarded a bonus of $10,000
 * Else if they manage to bring in exactly 500,000 then bonus will be sent in for review
 * Else they don't get a bonus
 */
		if (goodsSold == 500000) {
			System.out.println("Your bonus reward will be reviewed.");
		} else if (goodsSold > 500000) {
			System.out.println("Congratulations! You get a bonus of $" + bonus);
		} else
			System.out.println("No bonus this time");
	}

}
