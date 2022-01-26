package week1.day2;

import java.util.Arrays;

public class Anagram {

	/*
	 * Pseudo Code
	 * 
	 * Declare a String String text1 = "stops"; Declare another String String text2
	 * = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition) 
	 * b) Convert both Strings in to characters 
	 * c) Sort Both the arrays 
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String args[])
	{
	String text1 = "stops";
	char[] c1=text1.toCharArray();
	String text2 = "potss";
	char[] c2=text2.toCharArray();
	int len1 = text1.length();
	int len2 = text2.length();
	Arrays.sort(c1);
	//System.out.println(c1);
	Arrays.sort(c2);
	//System.out.println(c2);
	if(len1==len2)
	{
		for(int i=0;i>=len1;i++)
		{
			
		}
		if(Arrays.equals(c1,c2))
			System.out.println("Given Strings are an Anagram");
		else
			System.out.println("Given Strings are not an Anagram");
			
	}}

}