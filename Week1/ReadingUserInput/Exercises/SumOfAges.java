import java.util.Scanner;

public class SumOfAges{
	public static void main(String[] args){
		String FirstName;
		String SecondName;
		int FirstAge;
		int SecondAge;
		int Sum;

		Scanner reader = new Scanner(System.in);

		//Get input for the first age and first name.
		System.out.print("Type your name: ");
		FirstName = reader.nextLine();
		System.out.print("Type your age: ");
		FirstAge = Integer.parseInt(reader.nextLine());
		System.out.println();
	
		//Get input for the Second age and second name
		System.out.print("Type your name: ");
		SecondName = reader.nextLine();
		System.out.print("Type your age: ");
		SecondAge = Integer.parseInt(reader.nextLine());
		System.out.println();


		//Calculate sum of ages.
		Sum = FirstAge + SecondAge;

		//Display names with sum of ages.
		System.out.println(FirstName + " and " + SecondName + " are " + Sum + " years old in total");
	}
}
		
	
