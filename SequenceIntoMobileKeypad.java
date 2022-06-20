package Strings;

//O(n),O(m) , m=keypad size// alphabet size

public class SequenceIntoMobileKeypad {

	public static void main(String[] args) {

		String keypad[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666",
				"7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };

		String s = "HELLO WORLD";
		int n = s.length();
		String res = "";

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);

			if ((c >= 'a' && c <= 'z'))
				res += keypad[c - 'a'];

			else if ((c >= 'A' && c <= 'Z'))
				res += keypad[c - 'A'];

			else if (c == ' ')
				res += 0;
			else
				res += c;

		}

		System.out.println(res);

	}

}
