
public class StringReverse {
	public static void main(String args[]) {
		String name = "My name is Mukthadir?";
		String reverseNam = reverseName(name);
		
		System.out.println("Input string: " + name);
		System.out.println("Output string: " + reverseNam);
	}

	private static String reverseName(String name) {
		String[] words;
		String newFirst, newLast;
		char endPoint;
		StringBuilder newName = new StringBuilder();		
		
		words = name.split(" ");
		
		endPoint = words[words.length-1].charAt(words[words.length-1].length() - 1);
		newFirst = words[words.length - 1].substring(0, words[words.length - 1].length()-1);
		newLast = words[0] + endPoint;
//		newName = newName.append(endPoint);
		
		newName = newName.append(newFirst + " ");
		for(int i = words.length-2;i>0;i--) {
			newName = newName.append(words[i] + " ");
		}
		newName = newName.append(newLast);
		
		return newName.toString();
	}
}
