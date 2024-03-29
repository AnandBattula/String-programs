package stringPrograms;
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

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String str1 = sc.next();
		System.out.println("Enter String2: ");
		String str2 = sc.next();
		
		// to convert lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// to find the length and compare
		if(str1.length()!=str2.length()) {
			System.out.println("Two strings not Anagram....");
		}
		else {
			// to convert string into character array
			char [] arr1 = str1.toCharArray();
			char [] arr2 = str2.toCharArray();
			
			// sorting the array
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			// comparing both arrays with equals method
            if(Arrays.equals(arr1, arr2)==true) {
            	System.out.println("Two strings are Anagram....");
            }
            else {
            	System.out.println("Two strings not Anagram....");
            }
		}
		
		
	}

}
