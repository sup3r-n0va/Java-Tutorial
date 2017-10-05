import java.util.Scanner;

public class EvenAndOdd{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		//Variable to get numbers from stdin.
		int num = 0;

		//Variable to hold the sum of integers.
		int sum = 0;

		//Variable to hold the amount of integers
		//input from stdin.
		int count = 0;
	

		//Variable to hold the average of the numbers.
		double average;

		//Variable to hold the amount of even numbers
		//input from stdin.
		int even = 0;

		//Variable to hold the amount of odd numbers 
		//input from stdin.
		int odd = 0;


		//Get input from the user.
		System.out.println("Type numbers: ");

		while(num != -1){
			//Get input from the user
			//until num is = -1
			num = Integer.parseInt(reader.nextLine());

			//Now count the amount of numbers the user entered
			//and the sum of these numbers.
			if(num != -1){
				sum += num;
				count++;
				//now count the amount of even numbers
				//and odd numbers
				if(num % 2 == 0){
					//if number is divisble 
					//by two then it is a even number
					//so incrememt the even variable.
					even++;
				} else {
					//if not divisible by two then it is 
					//a odd number to increment odd.
					odd++;
				}
			} else {
				break;
			}
		}

		//Now display the amount of numbers the user has entered
		//the sum of these numbers.
		//Also the average of these numbers and amount of even and odd
		//numbers the user has entered.
		average = (double)sum / count;
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " +sum);
		System.out.println("How many numbers: " +count);
		System.out.println("Average: " +average);
		System.out.println("Even numbers: " +even);
		System.out.println("Odd numbers: " +odd);
	}
}
