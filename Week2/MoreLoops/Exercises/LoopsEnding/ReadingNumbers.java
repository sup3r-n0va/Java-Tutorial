import java.util.Scanner;

public class ReadingNumbers{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		int num = 0;

		//Ask the user to type in numbers.
		System.out.print("Type numbers: ");
		while(num != -1) {
			num = Integer.parseInt(reader.nextLine());
			
		}

		//If the user typed in -1 then display the following the;
		System.out.println("Thank you and see you later!");

	}
}
