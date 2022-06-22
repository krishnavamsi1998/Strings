package Strings;

//O(n3),O(res.length)

public class SmallestWindowInAString {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		String pat = "ork";

		int n = s.length();
		int min = Integer.MAX_VALUE;
		String res = "";

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				
				//check every char of pattern present in substring

				if (isPresent(s.substring(i, j), pat)) {
					int len = s.substring(i, j).length();
					//take the min
					if (min > len) {
						min = len;
						res = s.substring(i, j);
					}
				}
			}
		}

		System.out.println(res);
	}

	private static boolean isPresent(String str, String pat) {

		int n = pat.length();

		for (int i = 0; i < n; i++)
			//indexOf returns -1 if char is not present , else returns first occurence
			if (str.indexOf(pat.charAt(i)) == -1)
				return false;

		return true;
	}

}
