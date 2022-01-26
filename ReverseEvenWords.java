package week1.day2;


	
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	

			/* Pseudo Code:
			 
			 * Declare the input as Follow
		      		String test = "I am a software tester"; 
			a) split the words and have it in an array
			b) Traverse through each word (using loop)
			c) find the odd index within the loop (use mod operator)
			
			d)split the words and have it in an array
			
			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			
			 
		*/
public class ReverseEvenWords {
	public String reverse(String s) {
		String reversedString = "";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			reversedString = reversedString + charArray[i];
		}
		return reversedString;
	}
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String result = "";
		String[] testWords = test.split(" ");
		ReverseEvenWords object = new ReverseEvenWords();
		for(int i=0; i<testWords.length; i++) {
			if(i%2 != 0)
			{
				testWords[i] = object.reverse(testWords[i]);
			}
		}
		for(int i=0; i<testWords.length; i++)
		{
			result = result.concat(testWords[i]) + " ";
		}
		System.out.println(result);
	}

}