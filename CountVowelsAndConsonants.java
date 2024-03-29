package stringPrograms;
//Java Program to count the total number of vowels and consonants in a string

/*
In this program, our task is to count the total number of vowels and consonants present in the given string.

As we know that, the characters a, e, i, o, u are known as vowels in the English alphabet. Any character other
than that is known as the consonant.

To solve this problem, First of all, we need to convert every upper-case character in the string to lower-case 
so that the comparisons can be done with the lower-case vowels only not upper-case vowels, i.e.(A, E, I, O, U). 
Then, we have to traverse the string using a for or while loop and match each character with all the vowels, 
i.e., a, e, i, o, u. If the match is found, increase the value of count by 1 otherwise continue with the normal
flow of the program. The algorithm of the program is given below.
 */

/*
  Algorithm
--------------
STEP 1: START
STEP 2: SET vCount =0, cCount =0
STEP 3: DEFINE string str = "This is a really simple sentence".
STEP 4: CONVERT str to lowercase
STEP 5: SET i =0.
STEP 6: REPEAT STEP 6 to STEP 8 UNTIL i<str.length()
STEP 7: IF any character of str matches with any vowel then
vCount = vCount + 1.
STEP 8: IF any character excepting vowels lies BETWEEN a and z then
cCount = cCount =+1.
STEP 9: i = i + 1
STEP 10: PRINT vCount.
STEP 11: PRINT cCount.
STEP 12: END
 */
public class CountVowelsAndConsonants {

	public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;
        
        String str = "This is a really simple sentence";
        str=str.toLowerCase();
        
        for(int i=0; i<str.length(); i++)
        {
        	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='u' ||
        			str.charAt(i)=='o')
        	{
        		vCount++;
        		//System.out.println("Vowels are : "+ str.charAt(i));
        	}
        	else if(str.charAt(i)>='a' && str.charAt(i)<='z')
        	{
        		//System.out.println("Consonants are : " +str.charAt(i));
        		cCount++;
        	}
        }
        System.out.println("vowels are present :" +vCount);
        System.out.println("Consonants are present :" +cCount);

	}

}
