import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		//Number to hold the factorial.
		int factorial = 1;
		//Number to get the value of the 
		//factorial
		int num;
		//Number to counter.
		int i = 1;

		//Now as the user for the number
		//to get factorial from.
		System.out.print("Type a number: ");
		num = Integer.parseInt(reader.nextLine());

		//Now work out the factorial of the number.
		while(i <= num){
			if(num == 0){
				factorial = 1;
				break;
			} else{
				factorial *= i;
				i++;
			}
		}


		//Display the factorial.
		System.out.println("Factorial is " +factorial);
	}
}
