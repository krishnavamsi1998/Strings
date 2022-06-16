package Strings;

//O(n+m),O(1)
//all we need to do is avoid max collisions 
//for that we use strong hash function
// had a drawback in this code, either you can use capital or small letter
// we can also over come this - see gfg
public class RabinKarpUsingHash {

	public static void main(String[] args) {

		String s = "AABAACAADAABAABA";

		String k = "AABA";

		int b = 26;

		int p = 5381;

		int n = s.length();
		int m = k.length();

		int base = 26;

		int hash = calHash(k, p);

		int start = 0;
		int end = start + m;

		int h = calHash(s.substring(start, end), p);

		int charVal = 0;

		if (h == hash)
			System.out.println(start);
		

		while (start < n - m) {

			// recalculate h
			charVal = s.charAt(start) - 'A' + 1;
			
			//remove current char
			int va = ((int) (charVal * Math.pow(b, m - 1))) % p;
			
			//to avoid negative
			if (h - va < 0)
				h = (h - va + p) % p;
			else
				h = (h - va) % p;
			
			//shift left wards , this can be done by multiplying with base
			//ex :str = 2202   220->remove-> 20 ->left shift-> 20*10 =200->add 2->202 

			h = (h * b) % p;

			charVal = s.charAt(end) - 'A' + 1;
			//add next char
			h = (h + charVal) % p;

			end = end + 1;
			start = start + 1;
			
			if (h == hash)
				System.out.println(start);

		}

	}

	private static int calHash(String str, int p) {

		int val = 0;
		int n = str.length();

		for (int i = n - 1, j = 0; i >= 0 && j < n; i--, j++) {
			int charVal = str.charAt(i) - 'A' + 1;
			val += (charVal * Math.pow(26, j)) % p;
		}

		return val;
	}

}
