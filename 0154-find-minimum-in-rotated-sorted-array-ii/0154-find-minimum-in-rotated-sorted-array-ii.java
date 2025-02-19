class Solution {
    public int findMin(int[] nums) {

        int start = 0;
    	 int end = nums.length - 1;
    	 
    	 while(start < end) {
    		 
    		 int mid = start + (end - start)/2;
    		 
    		 if(nums[end] > nums[mid]) {
    			 end = mid;
    		 } else if(nums[mid] == nums[end]) {
    			 end = end - 1;
    		 } else {//nums[mid] > nums[end]
    			 start = mid + 1;
    		 }
    	 }
    	 
    	 return nums[start];
    }
}