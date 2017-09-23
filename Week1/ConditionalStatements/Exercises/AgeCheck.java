import java.util.Scanner;

public class AgeCheck{
	public static void main(String[] args){
		int Age;


		Scanner reader = new Scanner(System.in);

		//Ask the user for their age.
		System.out.print("How old are you? ");
		Age = Integer.parseInt(reader.nextLine());


		//Now check for the age.
		if(Age >= 0 && Age <= 120){
			System.out.println("OK");
		} else if(Age < 0){
			System.out.println("Impossible!");
		} else{
			System.out.println("Impossible!");
		}
	}
}
