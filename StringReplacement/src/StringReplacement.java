
public class StringReplacement {
	public static void main(String args[]) {
		String given = "John Doe Champ";
		String result;
		int length = given.length() + 6;
		
		result = replace(given, length);
		System.out.println("New replaced string is " + result);
	}
	
	public static String replace(String givenString, int length) {
		char[] input = new char[length];
		
		for(int i=0; i<givenString.length();i++) {
			input[i] = givenString.charAt(i);
		}
		
		for(int i = 0; i< input.length; i++) {
			if(input[i] == ' ') {
				for(int j=length-3;j>i;j--) {
					input[j+2] = input[j]; 
				}
				input[i] = '%';
				input[i+1] = '2';
				input[i+2] = '0';
			}
		}
		return new String(input);
	}
}
