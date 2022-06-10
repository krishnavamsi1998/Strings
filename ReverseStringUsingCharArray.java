package Strings;

//O(n),O(n)
public class ReverseStringUsingCharArray {

	public static void main(String[] args) {

		String s = "vamsi";
		char[] charArray = s.toCharArray();
		int n = charArray.length;
		int i = 0;
		int j = n - 1;

		while (i < j) {
			char t = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = t;
			i++;
			j--;
		}

		s = new String(charArray);

		System.out.println(s);

	}

}
