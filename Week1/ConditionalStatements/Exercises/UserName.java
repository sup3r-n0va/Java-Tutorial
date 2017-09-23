/*Create a Program that checks that allows a user based on their password.*/

import java.util.Scanner;


public class UserName{
	public static void main(String[] args){
		String UserName;
		String Password;

		Scanner reader = new Scanner(System.in);

		//Ask the user for their UserName
		System.out.print("Type your username: ");
		UserName = reader.nextLine();
		
		//Now ask the user for their Password.
		System.out.print("Type your password: ");
		Password = reader.nextLine();

		//Now compare if the UserName and Password match
		//if they do then let me login
		//else access denied.
		if(UserName.equals("alex") && Password.equals("mightyducks")){
			System.out.println("You are now logged into the system!");
		} else if(UserName.equals("emily") && Password.equals("cat")){
			System.out.println("You are now logged into the system!");
		} else{
			System.out.println("Your username or password was invalid!");
		}
	}
}
		
