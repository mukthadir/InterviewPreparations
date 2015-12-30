import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;

		
		for(int i = 0; i<n;i++) {
			count = n-1-i;
			char[] spaces = new char[count];
			char[] hash = new char[i+1];
			Arrays.fill(spaces, ' ');
			Arrays.fill(hash, '#');
			
			System.out.println(new String(spaces) + new String(hash));
		}	
	}
}
