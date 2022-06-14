package Strings;

//O(n3),O(n)
public class SubstringsPrint {

	public static void main(String[] args) {

		String s = "abc";

		int n = s.length();

		String v = "";

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				v = "";
				for (int k = i; k <= j; k++) {
					v += s.charAt(k);
				}
				System.out.println(v);
			}
		}
	}

}
