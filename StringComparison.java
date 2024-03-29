package stringPrograms;

public class StringComparison {
	public static void main(String[] args) {
		String s1="Virat Kohili";
		String s2="Virat Kohili";
		String s3 = new String("Virat Kohili");
		String s4 = new String ("Rohit Sharma");
		String s5="VIRAT KOHILI";

		
		
		// comparing with equals methods
		System.out.println("comparing with equals method........");

		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s3));  //true
		System.out.println(s1.equals(s4));  //false
		System.out.println(s1.equals(s5));  // false
		System.out.println(s2.equals(s3));  // true
		System.out.println(s2.equals(s4));  // false
		System.out.println(s2.equals(s5));  // false
		
		
		// comparing with equalsIgnoreCase method
		System.out.println("comparing with equalsIgnoreCase method........");
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println(s1.equalsIgnoreCase(s4)); // false
		System.out.println(s1.equalsIgnoreCase(s5)); // true
		System.out.println(s2.equalsIgnoreCase(s3)); // true
		System.out.println(s2.equalsIgnoreCase(s4)); // false
		System.out.println(s2.equalsIgnoreCase(s5)); // true
		
		
		
	}

}
