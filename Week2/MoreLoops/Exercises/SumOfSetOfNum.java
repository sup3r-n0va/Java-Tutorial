import java.util.Scanner;

public class SumOfSetOfNum{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		//Variable to hold the sum.
		int sum = 0;
		//Variable for the user to enter.
		int num;
		//Variable to for counter.
		int i = 0;

		//Ask the user which number they want to sum up to.
		System.out.print("Until what? ");
		num = Integer.parseInt(reader.nextLine());


		//Now loop until the user number is less than i.
		while (i <= num){
			sum += i; //sum = sum + i.
			i++;
		}
		
		//Display the sum to stdout.
		System.out.println("Sum is " +sum);
	
	}
}
