public class SecondsInAYear{
	public static void main(String[] args){
		int Seconds;
		int SecondsInAHour;
		int SecondsInADay;
		int SecondsInAWeek;
		int SecondsInAYear;

		Seconds = 60;
		SecondsInAHour = 60 * 60;	//There are 60 seconds in a minute
						//And 60 minutes in a hour.
		SecondsInADay = SecondsInAHour * 24;	//Multiply by number of hours in a day.


		SecondsInAWeek = SecondsInADay * 7;

		SecondsInAYear = SecondsInAWeek * 52;

		System.out.println("There are " +SecondsInAYear  + " seconds in a year");
	}
}
		
