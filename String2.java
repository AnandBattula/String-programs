package stringPrograms;
// Print the ASCII value of given string
public class String2 {
	public static void main(String[] args) {
		String s = "ITS SIMPLE";
		System.out.println("char"+"  "+"ASCII Value");

		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			// type casting 
			System.out.println(c+"--------"+(int)c);
		}
	}

}
