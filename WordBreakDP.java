package Strings;

import java.util.HashSet;

//O(n*n),O(n)
//O(n*s) , where s is the length of the longest word in set

public class WordBreakDP {

	public static void main(String[] args) {

		String s = "leetcode";
		// take hashset because it has O(1) time complexity operations
		int n = s.length();

		HashSet<String> hs = new HashSet<String>();
		hs.add("leet");
		hs.add("code");

		// create dp table with extra cell
		boolean[] dp = new boolean[n + 1];

		// empty string always true
		dp[0] = true;

		// at any point of time , dp[i] states that if string can be segmented from 0 to
		// i

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && hs.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}

		System.out.println(dp[n]);
	}

}
