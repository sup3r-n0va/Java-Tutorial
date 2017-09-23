import java.util.Scanner;

public class Divider{
	public static void main(String[] args){
		int FirstNum;
		int SecondNum;
		double Answer;

		Scanner reader = new Scanner(System.in);
		
		//Get input for first integer.
		System.out.print("Type a number: ");
		FirstNum = Integer.parseInt(reader.nextLine());

		//Get input for second integer.
		System.out.print("Type another number: ");
		SecondNum = Integer.parseInt(reader.nextLine());

		//Convert the integers into decimals than divide.
		Answer = (double) FirstNum / SecondNum;

		//Display the result.
		System.out.print("Division: ");
		System.out.println(FirstNum + " / " +  SecondNum + " = " + Answer); 
	}
}
