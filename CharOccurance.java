package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		// convert the string into char array
		char c[] = str.toCharArray();
		// get the length of the array
		int len = c.length;
		//System.out.println(len);
		// traverse from 0 till the array length
		for (int i = 0; i < len; i++) {
			// Check the char array has the particular char in it
			if(c[i]=='e')
  		// if is has increment the count
			count++;
			
		}
		// print the count out of the loop
		System.out.println("e is repeated "+count+" times");
	}

}
