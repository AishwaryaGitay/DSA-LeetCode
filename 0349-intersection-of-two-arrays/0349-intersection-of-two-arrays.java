class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<Integer>();
    	
    	for(int n : nums1) {
    		set.add(n);
    	}
    	int[] ans = new int[Math.min(nums1.length, nums2.length)];
    	
    	int count = 0;
    	for(int num : nums2) {
    		if(set.remove(num)) {
    			ans[count] = num;
    			count++;
    		}
    		
    	}
    	
    	return Arrays.copyOfRange(ans, 0, count);
    }
}