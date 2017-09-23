/* Create a Grade Based on a Course 
*0 - 29 = Failed
*30 - 34 = 1
*35 - 39 = 2
*40 - 44 = 3
*45 - 49 = 4
*50 - 60 = 5
*/

import java.util.Scanner;


public class GradesAndPoints{
	public static void main(String[] args){
		int Points;
		

		Scanner reader = new Scanner(System.in);
	
		//Ask the user for their points
		System.out.print("Type the points [0-60]: ");
		Points = Integer.parseInt(reader.nextLine());


		System.out.println();

		//Check to see what grade those points amount to.
		if(Points >= 0 && Points <= 29){
			System.out.println("Grade: Failed");
		} else if(Points >= 30 && Points <= 34){
			System.out.println("Grade: " +1);
		} else if(Points >= 35 && Points <= 39){
			System.out.println("Grade: " +2);
		} else if(Points >= 40 && Points <= 44){
			System.out.println("Grade: " +3);
		} else if(Points >= 45 && Points <= 49){
			System.out.println("Grade: " +4);
		} else {
			System.out.println("Grade: " +5);
		}
	}
}
			 
