package Strings;

//arr="apple", "ape", "april"
//op : ap

//O(min(arr)*N), O(m+k) m=size of substring ,  k= size of res string

public class LongestCommonPrefixBF {

	public static void main(String[] args) {

		String[] arr = { "apple", "ape", "april" };
		int size = arr.length;

		// finding minimum str in arr
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if (min > arr[i].length())
				min = arr[i].length();

		}

		int j = 1;

		String str = "";

		String res = "";

		int c = 0;

		// checking till min length arr
		while (j <= min) {
			// checking prefix starting from (0,1) i.e from a single char
			str = arr[0].substring(0, j);

			for (int i = 1; i < size; i++) {
				if (arr[i].substring(0, j).equals(str))
					c++;
				// fails , the no need to check further
				else
					break;

			}
			// logic if all strings has same substring
			if (c == size - 1)
				res = str;
			// re iteration
			c = 0;
			j++;

		}

		if (res.length() > 0)
			System.out.println(res);
		else
			System.out.println(-1);
	}

}
