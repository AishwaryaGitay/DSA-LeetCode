class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[] {-1,-1};
    	 ans[0] = searchOccurence(nums, target, true);
    	 if(ans[0] != -1) {
    		 ans[1] = searchOccurence(nums, target, false);
    	 }
    	 
    	 return ans;
    }


    private int searchOccurence(int[] nums, int target, boolean isFirstOccurence) {
		
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(target < nums[mid]) {
				end = mid - 1;
			} else if(target > nums[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if(isFirstOccurence) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}