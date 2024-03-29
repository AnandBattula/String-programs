package stringPrograms;

public class String3 {
	public static void main(String[] args) {
		String s = "Its32 Si25mple4527";
		
		// print only uppercase characters of a string
		System.out.println("print only uppercase characters");
		for(int i=0; i<s.length();i++)
		{
		//char c = s.charAt(i);
		if(Character.isUpperCase(s.charAt(i)));
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		}
		System.out.println();
		
		// print only lowercase characters of a string
		System.out.println("print only lowercase characters");
		for(int i=0; i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
		
		System.out.println();
		// print only digits
		System.out.println("print only digits");
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.print(s.charAt(i)+" ");
			}
			
		}
		System.out.println();
		
		// print only vowels
		System.out.println("print only vowels");
		for(int i=0; i<s.length(); i++) {
			char u = Character.toUpperCase(s.charAt(i));
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U')
			{
				System.out.print(u+" ");
			}
		}
		
	
	}

}
