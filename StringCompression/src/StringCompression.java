
public class StringCompression {
	private static StringBuffer compressed = new StringBuffer();

	public static void main(String args[]) {
		String givenString = "aaabbceddssdd";
		String result;
		
		result = compress(givenString);
		System.out.println("New String is " + result);
	}
	
	public static String compress(String string) {
		char temp;
		
		for(int i = 0; i<string.length();i++) {
			int j = i+1;
			temp = string.charAt(i);
			int count = 1;
			while(j< string.length() && temp == string.charAt(j)){
				count++;
				j++;
				i++;
			}
			if (count>1) {
				compressed.append(string.charAt(i));
				compressed.append(count);
			} else {
				compressed.append(string.charAt(i));
			}
		}
		
		if(compressed.toString().length() < string.length()) {
			return compressed.toString();
		} else {
			return string;
		}
	}
}
