import java.util.Scanner;

public class SumBetweenTwoNum{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		//Variable to hold the sum.
		int sum = 0;
		//Variable to hold the lower bound.
		int firstnum;
		//Variable to hold the upper bound.
		int lastnum;

		//Ask the user for the first number.
		System.out.print("First: ");
		firstnum = Integer.parseInt(reader.nextLine());
		
		//Ask the user for the last number.
		System.out.print("Last: ");
		lastnum = Integer.parseInt(reader.nextLine());

		//loop from the first number to last number
		//and sum all the numbers inbetween.
		while (firstnum <= lastnum){
			//sum all the numbers.
			sum += firstnum;
			//Increment first each time.
			//until it is greater than last.
			firstnum++;
		}

		//Now display the result to stdout.
		System.out.println("The sum " +sum);
	}
}
