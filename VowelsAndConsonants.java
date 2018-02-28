import java.util.Scanner;
public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter and I'll tell you if it's a vowel or consonant: ");
		char letter = input.nextLine().charAt(0);
		
		if(Character.toUpperCase(letter)=='A' || Character.toUpperCase(letter)=='E' || 
				Character.toUpperCase(letter)== 'I' || Character.toUpperCase(letter)=='O' ||
				Character.toUpperCase(letter)=='Y')
			System.out.println(letter + " is a vowel");
		else if (Character.isLetter(letter))
			System.out.println(letter + " is a consonant");
		else
			System.out.println(letter + " is an invalid input");
		
		

	}

}
