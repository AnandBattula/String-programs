package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public String removeDups(String S)
	{
		Set <Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<S.length();i++)
		{
			set.add(S.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
		return S;
	}
	public static void main(String[] args) {
		String S;
		RemoveDuplicateCharacters rdc = new RemoveDuplicateCharacters();
		rdc.removeDups("anand");
		
	}

}
