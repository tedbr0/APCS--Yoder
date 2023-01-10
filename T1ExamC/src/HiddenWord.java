
public class HiddenWord 
{
	 // ******************  Instance variables  ******************
	
	private static String guess;
	
	// *********************  Constructors  *********************
	public HiddenWord(String hidden)
	{
		guess = hidden;
	}
	// ********************  Public methods  ********************
	
	public String getHint(String input)
	{
		String result = "";
		for(int i = 0; i < input.length(); i++) //loop through the whole input string
		{
			if(input.charAt(i) == guess.charAt(i)) //also in the same position in the hidden word
			{
				result+= input.charAt(i);
			}
			else if(guess.contains("" + input.charAt(i))) //also in the hidden word, but in a different position
			{
				result+= "+";
			}
			else //not in the hidden word
			{
				result+= "*";
			}
		}
		return result;
	}
	
	
	public static void main(String[] args)
	  {
		HiddenWord puzzle = new HiddenWord("HARPS");
		puzzle.getHint("AAAAA");
	  }
}
