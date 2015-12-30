import java.util.HashMap;

public class FancyNumber {
	public static void main(String[] args) {
		int number = 666669999;
		Boolean result = fancyNumber2(number);
		System.out.println(result);
		int a = 5;
		float b = a/2;
		System.out.println(b);
		
		for(int i = 0; i<=9; i++)
			System.out.print(i + "\t");
		
		System.out.println("second round");
		for(int i = 0; i<=10; ++i)
			System.out.print(i + "\t");
		
		
		
		
		
		
	}

	private static Boolean fancyNumber(int number) {
		String numberAsString = Integer.toString(number);
		
		for(int i= 0; i< numberAsString.length(); i++) {
			if(numberAsString.charAt(i) == '2'
					|| numberAsString.charAt(i) == '3'
					|| numberAsString.charAt(i) == '4'
					|| numberAsString.charAt(i) == '5'
					|| numberAsString.charAt(i) == '7') {
				return false;
			}
		}
		
		if(numberAsString.length()%2 == 1) {
			if(numberAsString.charAt(numberAsString.length()/2) == '6'
					|| numberAsString.charAt(numberAsString.length()/2) == '9') {
				return false;
			}
		}
		
		for(int i = 0; i< numberAsString.length()/2; i++) {
			int temp = numberAsString.length() - 1 - i;
			
			if(!(numberAsString.charAt(i) == '6' && numberAsString.charAt(temp) == '9'
					|| numberAsString.charAt(i) == '1' && numberAsString.charAt(temp) == '1'
					|| numberAsString.charAt(i) == '0' && numberAsString.charAt(temp) == '0'
					|| numberAsString.charAt(i) == '8' && numberAsString.charAt(temp) == '8'
					|| numberAsString.charAt(i) == '9' && numberAsString.charAt(temp) == '6')) {
				return false;
			}
		}
		return true;
	}
	
	private static Boolean fancyNumber2(int number) {
		String numberAsString = Integer.toString(number);
		int l,r;
		
		HashMap<Character, Character> fancyNumberPair = new HashMap<Character, Character>();
		fancyNumberPair.put('0', '0');
		fancyNumberPair.put('1', '1');
		fancyNumberPair.put('6', '9');
		fancyNumberPair.put('8', '8');
		fancyNumberPair.put('9', '6');
		
		l = 0;
		r = numberAsString.length()-1;
		
		while(l<=r) {
			if(fancyNumberPair.get(numberAsString.charAt(l)) != numberAsString.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
