public class  ChangingVariablesEx2{
	public static void main(String[] args){
		int length = 100;

		System.out.println(length);	//Displays 100 on the screen.
	
	
		System.out.println();

		length = length - 50;		//Subtract 50 from the value in the length variable.
		System.out.println(length);	//Display 50 to the screen.
	

		System.out.println();

		length = length * 2;		//Multiply the value of the length  variable now by 2
		System.out.println(length);	//Length will now become 100.
		
		System.out.println();

		length = length / 4;		//Now divide the value of the length variable by 4
		System.out.println(length);	//Length will now be 25.

		System.out.println();

		length--;			//Subtract 1 from the value in the length variable.
		System.out.println(length);	//Length value will now be 24.
	}
}
