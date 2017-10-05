
import java.util.Scanner;

public class SumAndCount{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		//Users numbers
		int num = 0;
		//To hold the sum of the numbers.
		int sum = 0;
		//To count how many numbers the user typed in.
		int count = 0;


		//Ask the user to type in numbers from stdin.
		System.out.println("Type numbers: ");
		while (num != -1){
			//Ask the user to type in numbers.
			num = Integer.parseInt(reader.nextLine());
			//Now calculate the sum of numbers.
			//Also how many numbers the user stored in.
			if(num != -1){
				sum += num;
				count++;
			} else{
				break;
			}
		}
	
		//Now display exit message
		//The sum of numbers.
		//Also how many numbers have come from stdin.
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " +sum);
		System.out.println("How many numbers: " +count);
		
	}
}
