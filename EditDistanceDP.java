package Strings;

//O(m*n), O(m*n)

public class EditDistanceDP {

	public static void main(String[] args) {

		String s1 = "sunday";
		String s2 = "saturday";
		System.out.println(minEdits(s1, s2, s1.length(), s2.length()));

	}

	private static int minEdits(String s1, String s2, int m, int n) {

		// create dp table with m+1 rows and n+1 cols
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {

			for (int j = 0; j <= n; j++) {
				// if s1 empty
				if (i == 0)
					dp[i][j] = j;

				// if s2 empty
				else if (j == 0)
					dp[i][j] = i;

				// if both string chars are same , then take diagonal value

				// i-1 and j-1 because we starting from empty string onwards

				else if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];

				// if different , then take 1+min of 3 left , diagonal , top value

				else
					dp[i][j] = 1 + min(dp[i][j - 1], dp[i - 1][j - 1], dp[i - 1][j]);

			}

		}

		// return last cell value
		return dp[m][n];
	}
	
	
	private static int min(int x, int y, int z) {

		if (x <= y && x <= z)
			return x;
		else if (y <= x && y <= z)
			return y;
		else
			return z;

	}

}
