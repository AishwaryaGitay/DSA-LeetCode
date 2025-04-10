class Solution {
    public void reverseString(char[] s) {
      int st = 0 ;
		int e = s.length - 1;
		
		helperForReverse(st,e,s);
		//System.out.println("the reversed array is :" +Arrays.toString(s));
    }

	private char[] helperForReverse(int st, int e, char[] s) {
		if(st > e) {
			return s;
		}
		
		char temp = s[st];
		s[st] = s[e];
		s[e] = temp;
		
		return helperForReverse(st+1, e-1, s);
}
}