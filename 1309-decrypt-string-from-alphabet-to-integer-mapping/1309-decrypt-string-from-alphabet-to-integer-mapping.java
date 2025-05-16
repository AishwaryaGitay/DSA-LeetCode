class Solution {
    public String freqAlphabets(String s) {
        
        int i = s.length() - 1;
			char start = 'j';
			char singleChar = 'a';
			StringBuilder res = new StringBuilder();
			
			while(i >= 0) {
				if(s.charAt(i) == '#') {
					char c2 = s.charAt(i - 1);
					char c1 = s.charAt(i - 2);
					
					int num = (c1 - '0') * 10 + (c2 - '0');
					
					int sub = num - 10;
					char chr = (char) (start + sub);
					res.append(chr);
					
					i = i - 3;
					
				}else {
					int singleNum = s.charAt(i) - '0';
						char ad = (char) (singleChar + singleNum - 1);
						res.append(ad);
						i--;

				}
				
			}
			
			return res.reverse().toString();
    }
}