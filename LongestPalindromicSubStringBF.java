package Strings;

//O(n3),O(n)

public class LongestPalindromicSubStringBF {

	public static void main(String[] args) {

		String s = "forgeeksskeegfor";

		int n = s.length();
		int max = 0;
		int len = 0;
		String k = "";
		String longString = "";

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				k = s.substring(i, j);

				if (isPalindrome(k)) {
					len = k.length();

					if (max < len) {
						longString = k;
						max = len;

					}
				}

			}
		}

		System.out.println(longString);

	}

	private static boolean isPalindrome(String s1) {

		// if single character then return false
		if (s1.length() == 1)
			return false;

		int i = 0;
		int j = s1.length() - 1;

		// two pointer approach to determine whether string is palindrome or not
		while (i < j) {
			if (s1.charAt(i) != s1.charAt(j))
				return false;
			i++;
			j--;

		}
		return true;

	}

}
