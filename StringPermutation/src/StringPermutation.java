
public class StringPermutation {
	public static void main(String args[]) {
		String string1 = "namen";
		String string2 = "emnan";
		Boolean result;
		
		CheckPermutation check = new CheckPermutation();
		check.setString1(string1);
		check.setString2(string2);
		
		result = check.checkPermutation();
		System.out.println("Is String2 a permutation of String1? " + result);
	}

}
