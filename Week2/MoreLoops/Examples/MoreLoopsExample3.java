import java.util.Scanner;

public class MoreLoopsExample3{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);


		System.out.println("Type your age: ");

		int age = Integer.parseInt(reader.nextLine());
	
		while(age < 5 || age > 85){	//Age is less than 5 OR greater than 85.
			System.out.println("You are Lying!");
			if(age < 5){
				System.out.println("You are so young that you cannot know how to write!");
			} else if(age > 85){
				System.out.println("You are so old that you cannot know how to use computer!");
			}

			System.out.println("Type your age again: ");
			age = Integer.parseInt(reader.nextLine());
		}

		System.out.println("Your age is " + age);
	}
}
