public class DecimalOperations{
	public static void main(String[] args){
		int result = 3 / 2;	//Result is 1 (integer) because 3 and 2 are integers as well.

		System.out.println(result);
		
		int first = 3;
		int second = 2;
		
		double Result = first / second;	//The result is again 1 because first and second are integers

		System.out.println(result);

		int remainder = 7 % 2;		//Remainder is 1 (integer)

		System.out.println(remainder);

		double WhenDividendIsFloat  = 3.0 / 2;		//Result is: 1.5
		double WhenDivisorIsFloat = 3 / 2.0;		//Result is: 1.5

		System.out.println(WhenDividendIsFloat);
		System.out.println(WhenDivisorIsFloat);
	}
}
