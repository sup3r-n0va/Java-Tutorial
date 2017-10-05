import java.util.Scanner;

public class LowerLimitAndUpperLimit{
		public static void main(String[] args){
			int First;
			int Last;

			Scanner reader = new Scanner(System.in);

			//Ask the user for the first number.
			System.out.print("First: ");
			First = Integer.parseInt(reader.nextLine());

			//Ask the user for the Last Number.
			System.out.print("Last: ");
			Last = Integer.parseInt(reader.nextLine());

			while (First <= Last){
				if(Last < First){
					break;
				} else {
					System.out.println(First);
					First++;
				}
			}
		}
}
			
