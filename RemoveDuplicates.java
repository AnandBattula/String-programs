package stringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "anand";
		
		Map<Character, Integer> map = new LinkedHashMap<> ();
		
		for(int i=0; i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i),1);
			}
		}
		for(int i=0; i<s.length();i++) {
			if(map.get(s.charAt(i))>1);
			System.out.println(s.charAt(i));
		}
	}

}
