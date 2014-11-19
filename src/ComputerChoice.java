import java.util.Random;

public class ComputerChoice
{
	// 3 Move objects: Rock, Paper, Scissors
	// Initialize variables;
	
	// Constructor with (variables/fields) to pass values
	public ComputerChoice() 
	{
		// Create a Random object.
	} // end constructor Welcome

	// Hi:  More than half of dice(s) value  (1 dice this means 4,5,6  .... 2 dices means 7 to 12....)
	// Lo:  Less than or equal to half of dice(s) value (1 dice this means 1,2,3  .... 2 dices means 1 to 6....)
	
	// Method should generate a random number and
	// 	return the computers choice.
	public static String computerChoice() 
	{
		// Create a Random object.
		Random rand = new Random();

		// Generate a random number in the range of
		// 1 through 3.
		int num = rand.nextInt(6) + 1;
		System.out.println( "Dice random number is " + num );

		if (num <= 3)
		{
			num = 1;
		}
		else if (num >= 4)
		{
			num = 6;
		}
		// Return the computer's choice.
		return Translation.getChoice (num) ;
	}
	

} // end class ComputerChoice