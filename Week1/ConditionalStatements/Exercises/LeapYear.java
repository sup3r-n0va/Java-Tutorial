/*Program to check if a given a year is a leap year.*/


import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		int Year;

		Scanner reader = new Scanner(System.in);

		//Ask the user for a year.
		System.out.print("Type a year: ");
		Year = Integer.parseInt(reader.nextLine());


		//Calculate if it is a leap year.
	        if((Year % 100 == 0 && Year % 400 == 0)){
			System.out.println("This is a leap year.");			
		} else if(!(Year % 100 == 0) && (Year % 4 == 0)){
			System.out.println("This is a leap year.");
		} else {
			System.out.println("The year is not a leap year.");
		}
	}
}
