package Strings;

import java.util.Map;
import java.util.TreeMap;


//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//Output: "leetcode"

//O(n),O(n)
public class ShuffleStringLC {

	public static void main(String[] args) {

		String s = "codeleet";
		int[] arr = { 4, 5, 6, 7, 0, 2, 1, 3 };
		int n = s.length();

		Map<Integer, Character> map = new TreeMap<>();

		for (int i = 0; i < n; i++)
			map.put(arr[i], s.charAt(i));

		String res = "";

		for (Character ch : map.values())
			res += ch;

		System.out.println(res);

	}

}
