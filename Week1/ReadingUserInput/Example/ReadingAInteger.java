import java.util.Scanner;

public class ReadingAInteger{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.print("Your name: ");
		String name = reader.nextLine();		//Reads a line from the users keyboard


		System.out.print("How old are you? ");
		int Age = Integer.parseInt(reader.nextLine());		//Reads a string variable from the keyboard and transfers it to
									//an integer.


		System.out.println("Your name is: " + name + " and you're " + Age + " years old");

	}
}
