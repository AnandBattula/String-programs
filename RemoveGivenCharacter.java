package stringPrograms;

public class RemoveGivenCharacter {
	
	public static void removeCharacter(String str, char c) {
		String finalStr = "";
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) != c) {
				finalStr = finalStr + str.charAt(i);
			}
		}
		System.out.println(finalStr);
	}
	
	
	public static void main(String[] args) {
		
		String str = "CloudTeCh";
		
		char ch = 'C';
		removeCharacter(str, ch);
		
		
		/*
		   String finalStr = "";
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) != 'C') {
				finalStr = finalStr + str.charAt(i);
			}
		}
		System.out.println(finalStr);
		 */
	}

}
