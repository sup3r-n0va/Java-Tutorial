import java.util.Scanner;

public class PositiveNumber{
	public static void main(String[] args){
		int Num;

		Scanner reader =  new Scanner(System.in);


		//Ask the user for input on a integer.
		System.out.print("Type a number: ");
		Num = Integer.parseInt(reader.nextLine());

		
		System.out.println();
		
		//Check if the number is greater than 0
		if(Num > 0){
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is negative");
		}
	}
}
