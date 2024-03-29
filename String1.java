package stringPrograms;
// find the characters of given string
public class String1 {
	public static void main(String[] args) {
		String s = "ITS SIMPLE";
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			System.out.println(c);
		}
	}

}
