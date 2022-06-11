package Strings;

//The indexOf() method returns the index of the first appearance of the 
//specified substring in the string, and returns -1 if the substring is not found.

//we can also do it with contains method , it returns true if substring found

//O(n2),O(2n)

// space complexity is O(2n) since new string object create when concatenated

public class StringIsRotationOfAnotherUsingIndexOf {

	public static void main(String[] args) {

		String s1 = "vamsi";
		String s2 = "sivam";
		
		//concatenate s1 with s1 so that s2 will be substring of it
		if (s1.length() == s2.length())
			System.out.print(isRotation(s1 + s1, s2));
		else
			System.out.println(false);

	}

	private static boolean isRotation(String s1, String s2) {

		if (s1.indexOf(s2) != -1)
			return true;

		return false;
	}

}
