import java.util.StringTokenizer;
class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = Integer.MIN_VALUE;
			
			for(String str : sentences) {
				StringTokenizer token = new StringTokenizer(str);
				max = Math.max(max, token.countTokens()); 
			}
			
			return max;
	    }
    }
