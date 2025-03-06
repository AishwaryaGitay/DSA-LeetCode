class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        	
        	for(int n : nums1) {
        		int freq = map.getOrDefault(n, 0);
                map.put(n, freq + 1);
        	}
        	
        	int[] ans = new int[Math.min(nums1.length, nums2.length)];
        	
        	int count = 0;
        	for(int num : nums2) {

        		if(map.get(num) != null && map.get(num) > 0) {
        			ans[count] = num;
        			count++;
        			map.put(num, map.get(num) - 1);
        		}
        		
        	}
        	
        	return Arrays.copyOfRange(ans, 0, count);
    }
}