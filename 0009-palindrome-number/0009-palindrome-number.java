class Solution {
    public boolean isPalindrome(int x) {

     int[] digits = Integer.toString(x).chars().map(c -> c-'0').toArray();
			int start = 0;
			int end = digits.length - 1;
			
			while(start <= end) {
				if(digits[start] == digits[end]) {
					start++;
					end--;					
				}else {
					return false;
				}
			}
			
			return true;   
    }
}