/**
 * Increasing by a factor =/= adding. Increasing by a FACTOR means to multiply.
 * If a price increase by a factor of 10 you would use the *= operator just like you would use
 * the += and -= operators
 * @author CrabbyTrees
 *
 */
public class IncreaseFactor {

	public static void main(String[] args) {
		 
		double price = 4.99;
		double priceIncrease = (price *= 10);
		
		System.out.println((float)priceIncrease);

	}

}
