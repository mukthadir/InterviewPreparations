
public class ThreeFive {
	public static void main(String args[]) {
//		for(int i = 1; i <= 100; i++) {
//			if(i%3 ==0 && i%5 == 0) {
//				System.out.println("BizzFizz " + i);
//			} else if (i%3 ==0 && i%5 != 0) {
//				System.out.println("Bizz " + i);
//			} else if (i%3 !=0 && i%5 == 0) {
//				System.out.println("Fizz " + i);
//			}
//		}
		
		for(int i = 3; i<=99; i += 3) {
			if (i%5 !=0) {
				System.out.println("Bizz " + i);
			}
		}
		
		for(int i = 5; i<=100; i += 5) {
			if (i%3 !=0) {
				System.out.println("Fizz " + i);
			}
		}
		
		for(int i = 15; i<=100; i += 15) {
			System.out.println("BizzFizz " + i);
		}	
	}
}
