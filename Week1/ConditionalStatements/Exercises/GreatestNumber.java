import java.util.Scanner;

public class GreatestNumber{
	public static void main(String[] args){
		int FirstNum;
		int SecondNum;

		Scanner reader = new Scanner(System.in);

		//Ask the user for the first integer.
		System.out.print("Type the first number: ");
		FirstNum = Integer.parseInt(reader.nextLine());
	
		//Ask the user for the second integer.
		System.out.print("Type the second number: ");
		SecondNum = Integer.parseInt(reader.nextLine());

	
		System.out.println();
	
		//Now check if the first number is greater than 
		//the second.
		if(FirstNum  > SecondNum){
			System.out.println("Greater number is: " +FirstNum);
		} else if(FirstNum == SecondNum){
			System.out.println(FirstNum + " and " + SecondNum + " are equal");
		} else {
			System.out.println("Greater number is: " +SecondNum);
		}
	}
}
