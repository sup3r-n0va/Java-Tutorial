import java.util.Scanner;		//This imports the library for user input function.

public class ReadingAString{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Who is greeted: ");
		String name = reader.nextLine();		//Reads a line of input from the user and assigns it
								//to a variable
	
		System.out.println("Hi " + name);
	}
}



