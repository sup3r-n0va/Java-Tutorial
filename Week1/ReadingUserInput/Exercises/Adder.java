import java.util.Scanner;

public class Adder{
	public static void main(String[] args){
		int FirstNum;
		int SecondNum;
		int Sum;

		Scanner reader = new Scanner(System.in);

		//get input for the first integer.
		System.out.print("Type a number: ");
		FirstNum = Integer.parseInt(reader.nextLine());
		
		//Get input for the second integer.
		System.out.print("Type another number: ");
		SecondNum = Integer.parseInt(reader.nextLine());

		//Now get the sum of the two numbers.
		Sum = FirstNum + SecondNum;

		//Display the sum
		System.out.println("Sum of the numbers: " + Sum);

	}
}
