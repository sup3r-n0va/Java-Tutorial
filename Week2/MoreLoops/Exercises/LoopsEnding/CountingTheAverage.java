import java.util.Scanner;

public class CountingTheAverage{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		//Numbers for the user to input.
		int num = 0;

		//Variable to hold the sum.
		int sum = 0;

		//Variable to get theamount of integers 
		//the user has inputted.
		int count = 0;

		//Variable to get  the average.
		double average;


		//Ask user to type in some numbers.
		System.out.println("Type Numbers: ");

		while(num != -1){
			//Ask the user for numbers 
			//if the user enters -1
			//exit out of the program.
			num = Integer.parseInt(reader.nextLine());
			if(num != -1){
				sum += num;
				count++;
			} else {
				break;
			}
		}

		//Now get the Average of the numbers.
		//Also get the amount of numbers from input
		//and the sum of the numbers.
		average = (double)sum / count;
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " +sum);
		System.out.println("How many numbers: " +count);
		System.out.println("Average: " +average);
	}
}
