public class LogicalOperators{
	public static void main(String[] args){
		int Number = 99;

		if((Number > 0 && Number < 10)  || Number > 100){
			System.out.println("The number was in the range 1-9 or it was over 100");
		} else{
			System.out.println("The number was less than or equal to 0 or it was greater than 10 but less than 100");
		}
	}
}
