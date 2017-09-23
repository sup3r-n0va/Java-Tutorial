import java.util.Scanner;

public class Circum{
	public static void main(String[] args){
		int Radius;
		double circumference;

		Scanner reader = new Scanner(System.in);

		//Get radius value from the user.
		System.out.print("Type the radius: ");
		Radius = Integer.parseInt(reader.nextLine());

		//Calculate the circumference.
		circumference = 2 * Math.PI * Radius;

		//Display the circumference.
		System.out.print("Circumference of the circle: ");
		System.out.println(circumference);
	}
}
