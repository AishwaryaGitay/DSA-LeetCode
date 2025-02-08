class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    if(nums==null || nums.length==0)
       return false;
    
    Set<Integer> numSet = new HashSet<Integer>();
			
			for(int i = 0 ; i < nums.length ; i++) {
				if(!numSet.add(nums[i])) {
					return true;
				}
			}
			
			return false;
    }
}