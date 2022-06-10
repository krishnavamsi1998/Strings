package Strings;

//O(n),O(1)

//String is immutable while string builder is mutable
//String does not have reverse method while string builder has

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("vamsi");
		// System.out.println(s.hashCode());
		s.reverse();
		// System.out.println(s.hashCode());
		System.out.println(s);

	}

}
