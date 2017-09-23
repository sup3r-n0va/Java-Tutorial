/*Program that checks whether a number is even or odd.*/

import java.util.Scanner;

public class EvenOrOdd{
	public static void main(String[] args){
		int Num;

		Scanner reader = new Scanner(System.in);

		//Ask the user to type in a number.
		System.out.print("Type a number: ");
		Num = Integer.parseInt(reader.nextLine());

		//Check to see if the number entered in by user
		//is even or odd.
		if(Num % 2 == 0){
			System.out.println("Number " + Num + " is even");
		} else {
			System.out.println("Number " + Num + " is odd");
		}
	}
} 
