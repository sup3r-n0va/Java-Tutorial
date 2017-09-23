import java.util.Scanner;

public class Password{
	public static void main(String[] args){
		//Set the password to carrot
		String Password = "carrot";

		Scanner reader = new Scanner(System.in);


		while(true){
			//Ask the user for the password
			System.out.print("Type the password: ");
			String Guess = reader.nextLine();
			
			if(Guess.equals("carrot")){
				System.out.println("Right!");
				System.out.println();
				System.out.println("The secret is: You_Got_It_rIGHT");
				break;
			}else {
				System.out.println("Wrong!");
				continue;
			}
		}
	}
}		
