/**
 * Given two int variables, firstPlaceWinner and secondPlaceWinner, write some code that swaps there 
 * values.
 * *HINT* create temporary variables
 * Exercise 2.6
 * @author CrabbyTrees
 *
 */
public class SwappingValues {

	public static void main(String[] args) {
		
		String firstPlaceWinner = "Sarah";
		String secondPlaceWinner = "Kacie";
		String temp = new String();
		
		temp = firstPlaceWinner;
		firstPlaceWinner = secondPlaceWinner;
		secondPlaceWinner = temp;
		
		System.out.print("The first place winner is " + firstPlaceWinner +
				"\n" +  "The second place winner is " + secondPlaceWinner);
	}

}
