class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1) {
    		 return nums[0];
    	 }
    	 
    	 int start = 1;
    	 int end = nums.length - 2;
    	 
    	 if(nums[start-1] != nums[start]) {
    		 return nums[start-1];
    	 }
    	 if(nums[nums.length - 1] != nums[end]) {
    		 return nums[nums.length - 1];
    	 }
    	 
    	 while(start <= end) {
    		 
    		 int mid = start + (end - start)/2;
    		 
    		 if((nums[mid] != nums[mid-1]) && nums[mid] != nums[mid+1]) {
    			 return nums[mid];
    		 }
    		 
    		 if((mid % 2 == 1 && nums[mid - 1] == nums[mid])
    				 || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
    			 start = mid + 1;
    		 } else {
    			 end = mid - 1;
    		 }
    	 }
    	 
    	 return -1;
    }
}