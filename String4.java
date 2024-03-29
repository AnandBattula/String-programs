package stringPrograms;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		int count = 0;
		// count only uppercase characters 
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
			
		}
		System.out.println("No of Uppercase characters :"+count);
		System.out.println();
		
		// count only lowercase characters
		int count1 = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				count1++;
			}
		}
		System.out.println("No of lowercase characters :"+count1);
		System.out.println();
		
		// count only digits
		int count2 = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count2++;
			}
		}
		System.out.println("No of Digits present in string :" +count2);
		
		System.out.println();
		
		// count only vowels
		int countUpperCase = 0;
		int countLowerCase = 0;
		for(int i=0; i<s.length();i++)
		{
			// count only uppercase vowels
			char vowels = Character.toUpperCase(s.charAt(i));
			if(vowels=='A'|| vowels=='E'|| vowels=='I'||vowels=='O'||vowels=='U')
			{
				countUpperCase++;
			}
			
			// count only lowercase vowels
			char vowel = Character.toLowerCase(s.charAt(i));
			if(vowel=='a'|| vowel=='e'|| vowel=='i'||vowel=='o'||vowel=='u')
			{
				countLowerCase++;
			}
		}
		System.out.println("No of UpperCase Vowels :"+countUpperCase);
		System.out.println("No of LowerCase Vowels :"+countLowerCase);
		
		
		
		
		
		
		
		
		
	}
	


}
