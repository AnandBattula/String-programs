package stringPrograms;
import java.util.*;
public class Non_Repeating_Characters {
	static char nonRepeatingCharacter(String S)
	{
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<S.length(); i++)  // a
		{
			if(map.containsKey(S.charAt(i)))
			{
				map.put(S.charAt(i), map.get(S.charAt(i))+1);
			}
			else {
				map.put(S.charAt(i),1);
			}
		}
		for(int i=0; i<S.length(); i++)
		{
			if(map.get(S.charAt(i))==1)
			{
				return S.charAt(i);
			}
		
		}
		System.out.println(S);
		return '$';
	}
	public static void main(String[] args) {
		String S;
		nonRepeatingCharacter("anand");
		nonRepeatingCharacter("battula");
		
		
	}

}
