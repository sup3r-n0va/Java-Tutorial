import java.util.Scanner;

public class UpToACertainNum{
	public static void main(String[] args){
		int start = 0;
		int num;

		Scanner reader = new Scanner(System.in);

		//Ask the user for number.
		System.out.print("Up to what number? ");
		num = Integer.parseInt(reader.nextLine());

		//Now loop up to the user number.
		while (start <= num ) {
			if(start == num){
				break;
			} else{
				start++;
				System.out.println(start);
			}
		}
	}
}
