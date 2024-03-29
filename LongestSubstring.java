package stringPrograms;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcdab";
		
		HashSet<Character> hs =new HashSet<>();
		
		String longestTillNow ="";
		String longestOverAll = "";
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			
			if(hs.contains(c)) {
				longestTillNow="";
				hs.clear();
			}
			hs.add(c);
			longestTillNow=longestTillNow+c;
			
			if(longestTillNow.length()<longestOverAll.length()) {
				longestOverAll=longestTillNow;
			}
			//System.out.println(longestTillNow);
		}
		System.out.println(longestTillNow);
	}

}
