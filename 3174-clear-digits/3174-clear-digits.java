class Solution {
    public String clearDigits(String s) {
        
        for(int  i = 0 ; i < s.length() ; i++) {
					
					if(Character.isDigit(s.charAt(i)) && (s.charAt(i-1) >= 0 && Character.isAlphabetic(s.charAt(i-1))))  {
						s = s.replace(s.charAt(i-1)+""+s.charAt(i), "");
						i = i-2;
					}
				}
				return s;
    }
}