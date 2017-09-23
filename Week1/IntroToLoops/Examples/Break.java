import java.util.Scanner;

public class Break{
	public static void main(String[] args){

	
		Scanner reader = new Scanner(System.in);
		
		while(true){
			System.out.println("I can program!");
		

			System.out.println("Continue? ('no' to quit)? ");
			String command = reader.nextLine();
			if(command.equals("no")){
				break;
		         }
		}
	

		System.out.println("Thank you and see you later!");
	
	}
}
