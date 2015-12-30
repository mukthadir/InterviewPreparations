import java.util.ArrayList;

public class AllPalindromes {
	public static void main(String args[]) {
		String inputString = "dddd";
		
		int  i = 0;
		
		System.out.println(inputString.substring(0,i));
		
		
		
		
		
//		ArrayList<String> allPalindromes = findAllPalindromes(inputString);
		
//		for(String palindrome: allPalindromes) {
//			System.out.println(palindrome);
//		}
	}
	
	public static ArrayList<String> findAllPalindromes(String inputString) {
		ArrayList<String> allPalindromes = new ArrayList<String>();
		
		if(inputString == null) {
			return null;
		} else if(inputString.length() <= 1) {
			allPalindromes.add(inputString);
			return allPalindromes;
		}
		
		int length = inputString.length();
		
		for(int i = 0; i< length; i++) {
			allPalindromes.add(inputString.substring(i, i+1));
		}
		
		for(int i=0; i< length-1; i++) {
			if(inputString.charAt(i) == inputString.charAt(i+1)) {
				allPalindromes.add(inputString.substring(i, i+2));
			}
		}
		
		for(int l = 3; l<=length; l++) {
			for(int i=0; i<= length-l; i++) {
				int j= i+l-1;
				
				if(inputString.charAt(i) == inputString.charAt(j)) {
					allPalindromes.add(inputString.substring(i, j+1));
				}
			}
		}
		
		return allPalindromes;
	}
}
