package Strings;

import java.util.LinkedList;
import java.util.Queue;

//O(n),O(n)
public class StringIsRotationOfAnotherQueue {

	private static boolean isRotation(String s1, String s2) {

		int n1, n2;
		n1 = s1.length();
		n2 = s2.length();

		// two strings have to be of same lengths
		if (n1 != n2)
			return false;

		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();

		// add all chars of s1 in q1

		for (int i = 0; i < n1; i++)
			q1.add(s1.charAt(i));

		// add all chars of s2 in q2
		for (int i = 0; i < n2; i++)
			q2.add(s2.charAt(i));

		// just remove head and add it again , at given point of iteration , check q1
		// equals q2

		for (int k = n2; k > 0; k--) {

			char ch = q2.remove();
			q2.add(ch);

			if (q2.equals(q1))
				return true;

		}

		return false;
	}

	public static void main(String[] args) {

		String s1 = "vamsi";
		String s2 = "isvam";

		System.out.println(isRotation(s1, s2));

	}

}
