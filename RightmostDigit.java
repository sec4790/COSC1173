
/**
 * This exercise uses to % sign which gives you an output of the remainder between two values.
 * In this case x = 345, the remainder of 345/10 is 5 and the rightmost digit of 345.
 * Any number divided by ten will have it's very last digit as the remainder. 345/10 = 34.5
 * 346/10 = 34.6
 * @author CrabbyTrees
 *
 */

public class RightmostDigit {

	public static void main(String[] args) {

		int x = 345;
		System.out.println(x % 10);
	}

}
