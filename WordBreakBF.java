package Strings;

import java.util.ArrayList;
import java.util.List;

//O(2^n),O(n)
//because we for n times we have two choices , partition or not so 2^n
//interview bit and anuragvishwa

public class WordBreakBF {

	public static void main(String[] args) {

		String s = "abcdef";
		int n = s.length();

		List<String> list = new ArrayList<>();

		list.add("ab");
		list.add("cd");
		list.add("ef");

		System.out.println(isWordBreak(s, list));

	}

	private static boolean isWordBreak(String s, List<String> list) {

		// base case
		// basically this is when we reach end of string
		int n = s.length();

		if (n == 0)
			return true;

		// logic
		for (int i = 1; i <= n; i++)
			if (list.contains(s.substring(0, i)) && isWordBreak(s.substring(i, n), list))
				return true;

		// this is when above conditions are not met
		return false;
	}

}
