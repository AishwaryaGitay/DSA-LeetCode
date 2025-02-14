class Solution {
    public int thirdMax(int[] nums) {
        
       TreeSet<Integer> ts = new TreeSet<Integer>();
    	 for (int num : nums) {
    		 ts.add(num);
    		 if(ts.size() > 3) {
    			 ts.pollFirst();
    		 }
    	 }
    	 
    	 if(ts.size() < 3) {
    		 while(ts.size() > 1) {
    			 ts.pollFirst();
    		 }
    	 }
    	 
    	 return ts.pollFirst(); 
    }
}