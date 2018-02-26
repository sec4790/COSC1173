/**
 * The += and -= operators are a shorthand way of adding someting to a particular value and that
 * becoming a new total
 * In this case their are 5 bridge players
 * 4 more bridge players get added to the game so now
 * we have the old amount of bridge players plus a number
 * which is now = to the now current amount of bridge players.
 * If there were 10 bridge players and then 4 left the game then if you were to write
 * bridgePlayers -= bridgePlayers -4, the program woudl then display a value of 6
 * after the command is made
 * @author CrabbyTrees
 *
 */
public class IncreaseValues {

	public static void main(String[] args) {
		
		int bridgePlayers = 5;
		
		System.out.println(bridgePlayers += 4); //newBridgePlayers = oldBridgePlayers + 4

	}

}
