class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] charArray = new int[26];
				
				s = s.replace(" ","").toLowerCase();
				t = t.replace(" ","").toLowerCase();
				
				for(int  i = 0 ; i < s.length() ; i++) {
					charArray[s.charAt(i) - 'a']++;
				}
				
				for(int  i = 0 ; i < t.length() ; i++) {
					charArray[t.charAt(i) - 'a']--;
				}
				
				for(int count : charArray) {
					if(count != 0) {
						return false;
					}
				}
				
				return true;

    }
}