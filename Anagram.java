package stringPrograms;

import java.util.Arrays;

//Java Program to determine whether two strings are the anagram

/*
Two Strings are called the anagram if they contain the same characters.
However, the order or sequence of the characters can be different.

In this program, our task is to check for two strings that, they are the anagram or not. 
For this purpose, we are following a simpler approach.

First of all, Compare the length of the strings, if they are not equal in the length then 
print the error message and make an exit, otherwise, convert the string into lower-case for 
the easy comparisons. Sort both the strings using bubble sort or other sorting methods. 
If the strings are found to be identical after sorting, then print that strings are anagram 
otherwise print that strings are not the anagram.
 */

/*
 Algorithm
----------- 
STEP 1: START
STEP 2: DEFINE str1 = "Brag", str2 = "Grab".
STEP 3: CONVERT str1, str2 to lower-case.
STEP 4: IF length of str1, str2 are not equal then PRINT "Not Anagram"
else go to Step 5
STEP 5: CONVERT str1, str2 to character arrays.
STEP 6: SORT the arrays.
STEP 7: COMPARE the arrays, IF equal then PRINT "Anagram"
else
PRINT "Not Anagram"
STEP 8: END
 */
public class Anagram {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		
		// Converting both the string to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//Checking for the length of strings  
		if(str1.length()!=str2.length())
		{
			System.out.println("Two strings are not Anagram");
		}
		else
		{
			//Converting both the arrays to character array
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			// Sorting the array using in-built function sort()
			Arrays.sort(array1);
			Arrays.sort(array2);
		
		// Comparing both Arrays the using in-built function equals()
		if(Arrays.equals(array1,array2)==true)
		{
			System.out.println("Both the strings are Anagram");
		}
		else
		{
			System.out.println("Both the strings are not Anagram");
		}
	}
	}

}
