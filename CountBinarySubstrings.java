package Strings;

//O(n),O(1)

//keep track of two groups i.e group of zeros and group of ones

//add min(curr, prev ) to answer

//refer https://dev.to/seanpgallivan/solution-count-binary-substrings-p89#idea

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="00110011";
		
		System.out.println(countBinarySubstrings(s));
		

	}
	
	 public static int countBinarySubstrings(String s) {
	        int curr = 1, prev = 0, ans = 0;
	        for (int i = 1; i < s.length(); i++)
	            if (s.charAt(i) == s.charAt(i-1)) curr++;
	            else {
	                ans += Math.min(curr, prev);
	                prev = curr;
	                curr = 1;
	            }
	        return ans + Math.min(curr, prev);
	    }

}
