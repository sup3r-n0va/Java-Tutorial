import java.util.Scanner;

public class SumOfThreeNum{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int read;

		//Get the first integer from the user.
		System.out.print("Type the first number: ");
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;	
	
		//Get the second Integer from the user.
		System.out.print("Type the second number: ");
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;

		//Get the third Integer from the user.
		System.out.print("Type the third number: ");
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;

		System.out.println();

		//Display the sum.
		System.out.println("Sum: " + sum);
	}
}
