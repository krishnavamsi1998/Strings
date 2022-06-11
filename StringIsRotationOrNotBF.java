package Strings;

import java.util.Arrays;

//O(nlogn) , O(n)

public class StringIsRotationOrNotBF {

	public static void main(String[] args) {

		String s = "vamsi";
		String s1 = "ivams";

		char[] s2 = s.toCharArray();
		char[] s3 = s1.toCharArray();

		Arrays.sort(s2);
		Arrays.sort(s3);

		s = new String(s2);
		s1 = new String(s3);

		System.out.println(s.equals(s1));

	}

}
