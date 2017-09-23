public class StringComparison{
	public static void main(String[] args){
		String text = "course";
		String anothertext = "horse";

		if(text.equals("marzipan")){
			System.out.println("The text contains the string marizpan");
		} else{
			System.out.println("The variable text does not contain the text marzipan");
		}

		//The equals command can also be attached to a string variable.
		if(text.equals(anothertext)){
			System.out.println("The texts are the same!");
		} else {
			System.out.println("The texts are not the same!");
		}
	}	

}
