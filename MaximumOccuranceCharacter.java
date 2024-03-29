package stringPrograms;
//1) How to find the maximum occurring character in a given String?
import java.util.*;
public class MaximumOccuranceCharacter {
	String x = "GOD_BLESS_SPIDERMAN";
	char [] y = x.toCharArray();
	int size = y.length;
	Map<Character, Integer> map = new LinkedHashMap <> ();
	
	while (int i!= size)
	//for(int i=0; i<size;i++)
	{
		if(map.containsKey(y[i]))
		{
			map.put(y[i], 1);
		}
		else
		{
			int oldVal = map.get(y[i]);
			int newVal = oldVal+1;
			map.put(y[i], newVal);
		}
		++i;
	}
	Set<Map.Entry<Character, Integer>> lhmp = map.entrySet();
	char maxKey =' ';
	int maxVal = 0;
	for(Map.Entry<Character, Integer> data:lhmp);
	{
		if(data.getValue()>maxVal)
		{
			maxVal=data.getValue();
			maxKey = data.getKey();
		}
	}
	System.out.println(maxKey);
	System.out.println(maxVal);

}
}

