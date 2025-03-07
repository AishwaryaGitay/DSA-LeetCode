class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
    	Arrays.sort(s);
    		
    		int satisfied = 0;
    		int childrenCounter = 0;
    		int cookieCounter = 0;
    		
    		while(childrenCounter < g.length && cookieCounter < s.length) {
    			if(g[childrenCounter] <= s[cookieCounter]) {
    				satisfied++;
    				childrenCounter++;
    			}
    			 
                    cookieCounter++;
                
    		}
    		
    		return satisfied;
    }
}