package stringPrograms;
//Java Program to find the longest repeating sequence in a string

/*
 In this program, we need to find the substring which has been repeated in the original string more than once.

A	b	D	F	A	A	b	d	f	h
In the above string, the substring bdf is the longest sequence which has been repeated twice.
 */


/*
 Algorithm
-----------
STEP 1: START
STEP 2: DEFINE string str = "acbdfghybdf"
STEP 3: SET String lrs = " "
STEP 4: CALCULATE length.
STEP 5: SET i =0. REPEAT STEP 6 to STEP 10 UNTIL i<n.
STEP 6: SET j =i+1. REPEAT STEP 7 to STEP 9 UNTIL j<n.
STEP 7: CALL lcp() in String x.
STEP 8: if(x.length()>lrs.length()) then lrs =x
STEP 9: j =j + 1
STEP 10: i =i +1
STEP 11: PRINT lrs.
STEP 12: END
lcp(String s, String t)

STEP 1: START
STEP 2: SET n = Math.min(s.length(), t.length())
STEP 3: SET i =0. REPEAT STEP 4 to STEP 5 UNTIL i<n
STEP 4: if(s.charAt(i) != t.charAt(i)) then RETURN s.substring(0, i)
STEP 5: i= i+1
STEP 6: RETURN s.substring(0,n)
STEP 7: END
 */
public class LongestRepeatingSequence {
	public static void main(String[] args) {
		String str = "acbdfghybdf";
		String lrs = " ";
		int n = str.length();
		//for(int i=0;)
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
