package Strings;

import java.util.HashMap;
import java.util.Map;

//O(n+m),O(m) where m= pattern length
//watch coding simplified video
// this is an example of variable size sliding window 

public class MinimumSubstringWindowMatchAllPattern {

	public static void main(String[] args) {

		String s = "badeabcaae";
		String pat = "aabc";

		int n = s.length();
		int m = pat.length();

		System.out.println(findSubstring(s, pat, n, m));

	}

	private static String findSubstring(String str, String pattern, int n, int m) {

		if (str == null || str.length() == 0 || pattern == null || pattern.length() == 0) {
			return "";
		}

		Map<Character, Integer> map = new HashMap<>();
		int matchedElement = 0;
		int start = 0;
		int minSubstringLegth = Integer.MAX_VALUE;
		int minSubStringStart = 0;

		// storing all frequencies of chars in pattern
		for (int i = 0; i < pattern.length(); i++) {
			map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);
		}

		for (int end = 0; end < str.length(); end++) {
			char currentChar = str.charAt(end);

			if (map.containsKey(currentChar)) {
				// decrementing current matched char in map
				map.put(currentChar, map.get(currentChar) - 1);

				// if its 0 or greater then we can increment matched element
				if (map.get(currentChar) >= 0) {
					matchedElement++;
				}
			}

			// till matched elemnet remain same we minimize the window
			while (matchedElement == pattern.length()) {
				// storing min result
				if (end - start + 1 < minSubstringLegth) {
					minSubstringLegth = end - start + 1;
					minSubStringStart = start;
				}
				// minimizing the window by removing first char
				char charAtStart = str.charAt(start++);

				if (map.containsKey(charAtStart)) {
					// if its alraedy 0 and we are removing so matched elements will be decremented
					if (map.get(charAtStart) == 0) {
						matchedElement--;
					}
					// increment that char count since we removed
					map.put(charAtStart, map.get(charAtStart) + 1);
				}
			}

		}

		return str.substring(minSubStringStart, minSubStringStart + minSubstringLegth);
	}

}
