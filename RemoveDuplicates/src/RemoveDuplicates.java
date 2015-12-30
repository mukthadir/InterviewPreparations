
public class RemoveDuplicates {
	public static void main(String args[]) {
		int[] input = {1,5,3,7,3,1,5,3,2,67,3,6};
		int[] output = deleteDuplicates(input);
		
		for(int i = 0; i< output.length; i++) {
			System.out.println(output[i]);
		}
	}

	private static int[] deleteDuplicates(int[] input) {
		int temp;
		int zeroes = 0;
		int[] checker = new int[70];
		
		
		for(int i =0; i<input.length;i++) {
			temp = input[i];
			if(checker[temp] == 1) {
				input[i] = -1;
				zeroes++;
			}
			checker[temp] = 1;
		}
		
		for(int i = 0; i< input.length;) {
			if(input[i] == -1 && i+1<input.length) {
				input[i] = input[i+1];
				input[i+1] = -1;
			} else {
				i++;
			}
		}
		
		return input;
	}
}
