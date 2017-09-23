/*Program that asks for the user's age and tells
* whether user has reached the age of majority
* (i.e 18 years old or older)
*/
import java.util.Scanner;

public class AgeOfMajority{
	public static void main(String[] args){
		int age;

		Scanner reader = new Scanner(System.in);

		//Ask the user for their age.
		System.out.print("How old are you? ");
		age = Integer.parseInt(reader.nextLine());


		System.out.println();

		//Check if the age is the majority.
		if(age >= 18){
			System.out.println("You have reached the age of majority");
		} else if(age <= 0){
			System.out.println("Error!");
		} else {
			System.out.println("You have not reached the age of majority");
		}
	}
}
