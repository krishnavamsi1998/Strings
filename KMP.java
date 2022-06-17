package Strings;

//O(m+n) or O(n) if n>>>m
//O(m)

public class KMP {

	private static int[] computeLPS(int[] lps, int m, String pat) {

		// indicates len of prefix/suffix
		int len = 0;
		// pointer
		int i = 1;
		// since only one character cannot be a proper prefix or suffix
		lps[0] = 0;

		while (i < m) {

			if (pat.charAt(len) == pat.charAt(i)) {
				// increment len
				// why ? check if adjacent char matches or not
				// since we want the longest prefix/suffix

				lps[i] = len + 1;
				len++;
				i++;

			} else {
				// we mismatch , the len need to be adjusted backward
				// how the adjustment ? just like kmp
				// this overcome overlapping problem
				// aabaaac
				// lps 0101220

				// go back to lps[len-1]

				if (len != 0)

					len = lps[len - 1];

				else
					lps[i] = 0;
				i++;
			}

		}

		return lps;
	}

	public static void main(String[] args) {

		String str = "THIS IS A TEST TEXT";
		String pat = "TEST";
		int n = str.length();

		int m = pat.length();

		int[] lps = new int[m];

		lps = computeLPS(lps, m, pat);

		int i, j;
		i = j = 0;

		while (i < n) {
			if (str.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			} else {
				if (j != 0)
					j = lps[j - 1];

				else
					i++;

			}
			// this means we found a pattern
			if (j == m) {
				System.out.println(i - j);
				// resetting j if you want to find further
				j = lps[j - 1];

			}

		}

	}

}
