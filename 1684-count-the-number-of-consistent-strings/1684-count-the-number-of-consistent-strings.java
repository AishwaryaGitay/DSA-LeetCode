class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        /*
        The idea here is - 
        For each character 'a' to 'z', assign a bit from 0 to 25
        'a' -> bit 0
        'b' -> bit 1 ....... 'z' -> bit 25
        so we are setting 1 for a, for b - 10 (left shift 1 by 1) and so on...
         */
        int count = 0;
		int allowedMask = 0;
			
            //Create bitmask for allowed characters
			for(char ch : allowed.toCharArray()) {
				allowedMask = allowedMask | (1 << (ch - 'a'));
			}
			
			// For each word, check if all its characters are allowed
			for(String word : words) {
				int wordMask = 0;
				for(char c : word.toCharArray()) {
					wordMask = wordMask | (1 << (c - 'a'));
				}
				
                // If wordMask has no bits outside allowedMask, it's consistent
				if((wordMask & (~allowedMask)) == 0){
					count++;
				}
			}
			
			return count;
    }
}