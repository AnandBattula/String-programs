package stringPrograms;

// input: banand
// output: BAnand

public class To_Change_UpperCase_LowerCase {
	public static void main(String[] args) {
		String s = "banand";
		
		// use substring() and toUpperCase()
		
		System.out.println(s.substring(0, 2).toUpperCase()+s.substring(2));
	}

}
