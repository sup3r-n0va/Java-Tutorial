public class AssignmentOperators{
	public static void main(String[] args){
		int result = 0;


		//Often during a loop the value of a variable is calculated based on repetiton.
		//The following program calculates 3*4 as the sum  3+3+3+3.
		int i = 0;
		while (i < 4){
			result = result + 3;
			i++;
		}
		System.out.println(result);
	}
	
}
