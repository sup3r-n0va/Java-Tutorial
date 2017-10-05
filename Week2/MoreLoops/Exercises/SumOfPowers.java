import java.util.*;

public class SumOfPowers{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		//Counter variable.
		int i = 0;
		//Variable for power
		int power;
		//Variable to hold the sum.
		int sum = 0;
		//Variable to hold the result of
		//the powers.
		int PowerResult;

		//Get input from the user.
		System.out.print("Type a number: ");
		power = Integer.parseInt(reader.nextLine());
		

		//Now calculate the sum of the products
		// up to n.	
		while(i <= power){
			//First find the result of the power.
			PowerResult = (int)Math.pow(2, i);
			sum += PowerResult;
			i++;
		}
		
		//Now display the result of the sum.
		System.out.println("The result is " +sum);

	}
}

		
