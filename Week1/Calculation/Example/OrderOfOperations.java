public class OrderOfOperations{
	public static void main(String[] args){
		int first = 2;		//Variable of whole number type is assigned the value 2
		int second = 4;		//variable of whole number type is assigned the value 4
		int sum = first + second;	//Variable of whole number type is assigned the value of the first + second.
						//Which means 2 + 4

		System.out.println(sum);	//The value of the sum of the variables
		
		int CalcWithParens = (1 + 1) + 3 * (2 + 5); //23
		int CalcWithOutParens = 1 + 1 + 3 * 2 + 5; //13

		System.out.println("Calculation with Parenthese = " + CalcWithParens);
		System.out.println("Calculation Without Parenthese = " + CalcWithOutParens);

	}
}
