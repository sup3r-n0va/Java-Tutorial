import java.util.Scanner;

public class SumOfNum{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		int num = 0;
		int sum = 0;
	
		//Get input from the user for integers.
		System.out.println("Type numbers: ");
		while (num != -1){
			num = Integer.parseInt(reader.nextLine());
			//Now calculate the sum of integers typed
			// in by the user.
			if(num != -1) {
				sum += num;
			} else {
				break;
			}
		}	

		//Now display exit message
		//and sum of the numbers.
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " +sum);
	}
}
