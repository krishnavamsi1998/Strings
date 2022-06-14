package Strings;

//O(n2),O(1)

//watch neetcode

public class LongestPalindromicSubstringUsingExpandOutAlgo {

	public static void main(String[] args) {

		String s = "forgeeksskeegfor";
		int n = s.length();
		String res = "";
		int max = 0;

		for (int i = 0; i < n; i++) {

			int l, r, len;

			// for odd length

			if (n % 2 == 1) {
				l = i;
				r = i;
				while ((l >= 0 && r < n) && (s.charAt(l) == s.charAt(r))) {

					len = r - l + 1;
					if (len > max) {
						max = len;
						res = s.substring(l, r + 1);
					}

					l--;
					r++;
				}
			} else {
				// for even length
				l = i;
				// this is the only diff remaining all code same
				r = i + 1;
				while ((l >= 0 && r < n) && (s.charAt(l) == s.charAt(r))) {

					len = r - l + 1;
					if (len > max) {
						max = len;
						res = s.substring(l, r + 1);
					}

					l--;
					r++;
				}

			}
		}

		System.out.println(max + " " + res);

	}

}
