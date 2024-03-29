package stringPrograms;

import java.util.HashMap;

// Write a program to count the number  of words in a string using HashMap
public class FinalCountWords {
	public static void main(String[] args) {
		String str = "This this is is done by Anand Anand";
		
		// used split() function delimited by single space so that we can split multiple words in a string
		String [] split = str.split(" ");
		
		// Declared HashMap and iterated using for loop
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<split.length; i++)
		{
			if(map.containsKey(split[i]));
			{
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else
			{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
		
	}

}
