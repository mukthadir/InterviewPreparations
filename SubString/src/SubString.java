
public class SubString {
	public static void main(String[] args) {
		String string1 = "Mukthadir";
		String string2 = "Mukthadir";
		Boolean result;
		
		result = isSubstring(string1, string2);
		System.out.println("String2 is a substring of String1? " + result);
	}
	
	public static Boolean isSubstring(String string1, String string2) {
		int flag = 0;
		int k = 1;
		
		if(string1.length() != string2.length())
			return false;
		
		for(int i=0; i<string2.length(); i++) {
			if(string2.charAt(i) == string1.charAt(0)) {
				int temp = i;

				for(int j = i+1; j<string2.length(); j++) {
					if(string2.charAt(j) != string1.charAt(k)) {
						return false;
					}
					k++;
				}
				
				for(int j = 0; j<temp; j++) {
					if(string2.charAt(j) != string1.charAt(k)) {
						return false;
					}
					k++;
				}
				flag = 1;
			}
		}
		
		if (flag == 0)
			return false;

		return true;
	}	
}
