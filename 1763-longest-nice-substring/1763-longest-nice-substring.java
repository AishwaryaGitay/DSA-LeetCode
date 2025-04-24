class Solution {
    public String longestNiceSubstring(String s) {
        
        if(s.length() < 2) {
				return "";
			}
			
			HashSet<Character> set = new HashSet<Character>();
			
			for(char ch : s.toCharArray()) {
				set.add(ch);
			}
			
			for(int i = 0 ; i < s.length() ; i++) {
				char c = s.charAt(i);
				
				//if there is some character that does not have either upper or lowercase, we skip it.
				if(!set.contains(Character.toLowerCase(c)) || !set.contains(Character.toUpperCase(c))) {
					
					String left = longestNiceSubstring(s.substring(0,i));
					String right = longestNiceSubstring(s.substring(i+1));
					
					return left.length() >= right.length() ? left : right;
				}
			}
			
			// If we never split, the whole string is nice
			return s;
    }
}