package stringPrograms;
//Java Program to Count the Total Number of Punctuation Characters Exists in a String

/*
 * Steps to Count the Punctuations
Define a string or read from the user.
Declare a variable to count the number of punctuations and initialized it with 0.
Now, match each and every character with the punctuation marks (!, . , ' , - , " , ? , ; ). 
If any character in the string is matched with any of the punctuation marks, increment the count variable by 1.
At last, print the count variable that gives the total number of punctuations.
 */
public class CountPunctuations {

	public static void main(String[] args) {
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
		
		int count = 0;
		
		for(int i=0; i<str.length();i++)
		{
			//to check whether given character is punctuation or not
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
			{
				count++;
				System.out.println("punctuations are - (" +str.charAt(i)+") ");
			}
		}
		//Display what are punctuations and how many present
		System.out.println("The number of punctuations exists in the string is: " +count); 
	}
}
