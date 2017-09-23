import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		

		System.out.println("Welcome to the Calculator");

		Scanner reader = new Scanner(System.in);

		while(true){
			System.out.print("Enter a command (sum, difference, quit): ");
			String command = reader.nextLine();
			if(command.equals("quit")){
				break;
			}

			System.out.print("Enter the numbers: ");
			int First = Integer.parseInt(reader.nextLine());
			int Second = Integer.parseInt(reader.nextLine());
	
			if(command.equals("sum")){
				int sum = First + Second;
				System.out.println("The sum of the numbers is " +sum);
			}else if(command.equals("difference")){
				int difference = First - Second;
				System.out.println("The difference of the number is " +difference);
			} else{
				System.out.println("Unknown Command!");
			}
		}

		System.out.println("Thanks, bye!");
	}
}
