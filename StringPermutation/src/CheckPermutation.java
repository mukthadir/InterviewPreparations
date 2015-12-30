
public class CheckPermutation {
	private String string1;
	private String string2;
	
	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}	
	
	public Boolean checkPermutation() {
		int[] asciiArray = new int[256];
		int[] repeat = new int[256];
		
		if(string1.length() != string2.length()) {
			return false;
		}
		
		for(int i=0; i< string1.length();i++) {
			if (asciiArray[(int) string1.charAt(i)] == 0) {
				asciiArray[(int) string1.charAt(i)] = 1;
			} else {
				repeat[(int) string1.charAt(i)]++;
			}
		}
		
		for(int i = 0; i<string2.length(); i++) {
			if (asciiArray[(int) string2.charAt(i)] == 0) {
				return false;
			} else {
				if (repeat[(int) string2.charAt(i)]>=1) {
					repeat[(int) string2.charAt(i)]--;
				} else if (repeat[(int) string2.charAt(i)] == 0) {
					asciiArray[(int) string2.charAt(i)] = 0;
				} 
			}
		}
		
		return true;
	}
}
