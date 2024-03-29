package stringPrograms;

import java.util.Arrays;

public class Anagram1 {
	public static void main(String[] args) {
		String str1 = "Silent";
		String str2 = "Listen";
		isAnagram(str1,str2);
		
	}
	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean find =  Arrays.equals(arr1, arr2);
			System.out.println(find);
			
			
			
		}
		return false;
		
	}

}
