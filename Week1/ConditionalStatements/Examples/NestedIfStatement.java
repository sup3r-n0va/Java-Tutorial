public class NestedIfStatement{
	public static void main(String[] args){
		int x = 45;
		int number = 55;

	if(number > 0){
		System.out.println("The number is positive!");
		if(number > x){
			System.out.println(" and greater than the value of variable x");
			System.out.println(" after all, the value of variable x is " +x);
		}
	}

	}
}
