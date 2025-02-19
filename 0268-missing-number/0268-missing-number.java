class Solution {
    public int missingNumber(int[] nums) {
        
        int sumActual = 0;
    	 
    	 for(int i = 0 ; i < nums.length ; i++) {
    		 sumActual = sumActual - nums[i] + (i+1);
    	 }
    	 
    	 return sumActual;
    }
}