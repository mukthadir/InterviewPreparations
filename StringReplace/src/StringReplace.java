
public class StringReplace {
	public static void main(String args[]) {
		String input = "aaabbaaa";
		
		String output = modifiedString(input);
		System.out.println(output);
	}

	private static String modifiedString(String input) {
		StringBuilder modifiedString = new StringBuilder();
		
		for(int i = 0; i< input.length(); i++) {
			if(input.charAt(i) == 'a' && i+1< input.length() && input.charAt(i+1) == 'a') {
				modifiedString.append('a');
				i = i + 1;
			} else if (input.charAt(i) == 'b') {
				modifiedString.append("bb");
			} else {
				modifiedString.append(input.charAt(i));
			}
		}

		return modifiedString.toString();
	}
}
