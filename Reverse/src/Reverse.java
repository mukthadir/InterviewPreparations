
public class Reverse {
	public static void main(String args[]) {
		String name = "Mukthadir";
		String rev = reverse(name);
		System.out.println(rev);
	}

	private static String reverse(String name) {
		StringBuilder newName = new StringBuilder();
		
		for (int i = name.length()-1; i>=0; i--) {
			newName.append(name.charAt(i));
		}
		
		return newName.toString();
	}
}
