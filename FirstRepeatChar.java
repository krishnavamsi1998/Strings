package Strings;

//O(n),O(n)
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatChar {

	public static void main(String[] args) {

		String s = "vaamssi";

		System.out.println(firstRepChar(s));

	}

	private static Character firstRepChar(String s) {

		int n = s.length();

		// because Linked hash map preserves the insertion order
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < n; i++) {

			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);

		}

		// using entrySet iteration for efficiency

		Character res = null;

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			// first char to be repeated
			if (e.getValue() > 1) {

				res = e.getKey();
				break;
			}
		}

		return res;

	}

}
