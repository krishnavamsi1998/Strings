package Strings;

//O(n2),O(n2)
//still can you do it in O(n)?

public class LongestPalindromicSubstringDP {

	public static void main(String[] args) {

		String s = "GAMEOFTHRONESALGOTREERTOGLAWHY";
		int n = s.length();

		boolean[][] dp = new boolean[n][n];

		// single character is always a plaindrome (len 1)

		for (int i = 0; i < n; i++)
			dp[i][i] = true;

		// adjacent chars are same then its a palindrome (len 2)

		for (int i = 0; i < n - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1))
				dp[i][i + 1] = true;

		}

		// maxlength
		int max = 0;
		int begins = 0;
		int ends = 0;
		// start checking strings from len 3 to N

		for (int len = 3; len < n; len++) {

			for (int start = 0; start < n - len + 1; start++) {
				int end = start + len - 1;

				// begin and end chars should be same and middle one should be a palindrome then
				// its a palindrome
				if (s.charAt(start) == s.charAt(end) && dp[start + 1][end - 1]) {
					dp[start][end] = true;

					if (max < len) {
						max = len;
						begins = start;
						ends = start + len;
					}
				}

			}

		}

		System.out.println(max + " " + s.substring(begins, ends));

	}

}
