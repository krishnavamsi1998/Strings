package Strings;

//longest binary substring with 0's and 1's grouped together
//O(n),O(1)
//just trace the algo
//ex : 01111001
//output : 111100

public class FindLongestBinarySubstring {

	public static void main(String[] args) {

		String s = "00110011";
		int n = s.length();
		int max = 0;

		int start = 0;
		int end = start + 1;

		int len = 0;
		String res = "";

		if (n == 1) {
			res = s;
			max = n;
			System.out.println(max + " " + res);
		} else if (n == 2) {
			res = s;
			max = n;
			System.out.println(max + " " + res);
		} else {

			while (end + 1 < n) {

				while (s.charAt(end + 1) == s.charAt(end) || s.charAt(start) != s.charAt(end + 1)) {

					end++;
					
					if (end + 1 == n)
						break;
				}

				len = end - start + 1;

				if (max < len) {
					max = len;
					res = s.substring(start, end + 1);

				}

				while (end + 1 != n && s.charAt(start) == s.charAt(end + 1))
					start++;

				end++;

			}

			System.out.println(max + " " + res);
		}
	}

}
