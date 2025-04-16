class Solution {
    public int binaryGap(int n) {
        
        String binary = Integer.toBinaryString(n);
	    	int lastSeenOneIndex = -1;
	    	int max = 0;
	    	
	    	for(int i = 0 ; i < binary.length() ; i++) {
	    		if(binary.charAt(i) == '1') {
	    			if(lastSeenOneIndex != -1) {
	    				int distance = i - lastSeenOneIndex;
	    				max = Math.max(max, distance);
	    			}
	    			lastSeenOneIndex = i;
	    		}
	    	}
	    	return max;
    }
}