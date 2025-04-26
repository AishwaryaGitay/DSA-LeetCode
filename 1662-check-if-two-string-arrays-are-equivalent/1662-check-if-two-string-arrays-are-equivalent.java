class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
            int i = 0; // pointers for word1 and word2 arrays
			int j = 0;
			int p1 = 0; // // pointers inside each word
			int p2 = 0;
			
			while(i < word1.length && j < word2.length) {
				
                if(word1[i].charAt(p1) != word2[j].charAt(p2)) {
					return false;
				}
				
				p1++;
				p2++;
				
             // If we reach end of word1[i], move to next word
				if(p1 == word1[i].length()) {
					i++;
					p1 = 0;
				}
			 // If we reach end of word2[j], move to next word
				if(p2 == word2[j].length()) {
					j++;
					p2 = 0;
				}
			}
			

            // Both arrays must be fully traversed
			return i == word1.length && j == word2.length; 
    }
}