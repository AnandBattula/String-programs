package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "aadvdrdsfder";
		char str1 [] = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch:str1) {
			map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
		
		}
		for(Entry<Character,Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey());
			}
		}
	}

}
