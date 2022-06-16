package Strings;

//O(n*m),O(1)
//print index of matched pattern

public class RabinKarpBF {

	public static void main(String[] args) {

		// String that contains pattern
		String s = "AABAACAADAABAABA";
		// pattern to be searched
		String k = "AABA";

		int n = s.length();
		int m = k.length();

		// create a window of size of the pattern and keep checking
		for (int i = 0; i <= n - m; i++) {

			if (k.equals(s.substring(i, i + m)))
				System.out.println(i);

		}

	}

}
