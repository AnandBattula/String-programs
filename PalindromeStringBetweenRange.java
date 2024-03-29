package stringPrograms;

import java.util.Scanner;

public class PalindromeStringBetweenRange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println("Enter starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();
		
        // Extract the substring within the specified range
		String subString = str.substring(start,end+1);
		//System.out.println(subString);
		
        // Create the palindrome by reversing the substring
		String revString = "";
		for(int i = subString.length()-1; i>=0;i--) {
			revString = revString+subString.charAt(i);
		}
		//System.out.println(revString);
		
        // Insert the revString back into the original string
		StringBuilder result = new StringBuilder(str);
		
		 result.replace(start,end+1,revString);
		 System.out.println(result);
		
	}

}
