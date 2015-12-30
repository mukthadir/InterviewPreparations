
public class main {
	public static void main(String args[]) {
		String givenString = "Test  Sring";
		Boolean result;
		
//		result = checkUniqueness(givenString);
		result = checkWithoutDS(givenString);
		System.out.println("Does the string have unique characters? " + result);
	}
	
	public static Boolean checkUniqueness(String string) {
		Boolean flag = false;
		int[] asciiValues = new int[500];
		
		for (int i = 0; i< string.length(); i++) {
			if(asciiValues[(int) string.charAt(i)] == 0) {
				asciiValues[(int) string.charAt(i)] = 1;
				flag = true;
			} else {
				return false;
			}
		}
		return flag;
	}
	
	public static Boolean checkWithoutDS(String string) {
		Boolean flag = false;
		
		for(int i = 0; i<string.length(); i++) {
			for(int j=i+1; j<string.length(); j++) {
				if(string.charAt(i) == string.charAt(j)) {
					return false;
				}
			}
		}
		flag = true;

		return flag;
	}
}
