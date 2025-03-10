class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Optimal approach - two pointer
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
    		
    		Arrays.sort(nums);
    		
    		for(int i = 0 ; i < nums.length ; i++) {
    			
    			if(i > 0 && nums[i] == nums[i-1]) {
    				continue;
    			}
    			
    			int j = i+1;
    			int k = nums.length - 1;
    			
    			while(j < k) {
    				int sum = nums[i] + nums[j] + nums[k];
    				if(sum < 0) {
    					j++;
    				}else if (sum > 0) {
    					k--;
    				}else {
    					answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
    					j++;
    					k--;
    					while(j < k && nums[j] == nums[j-1]) {
    						j++;
    					}
    					while(j < k && nums[k] == nums[k+1]) {
    						k--;
    					}
    				}
    			}
    		}
    		
    		return answer;
    }
}


//Better approach - using hashset

// public static List<List<Integer>> threeSum(int[] nums) {
            
//     		Set<List<Integer>> setList = new HashSet<List<Integer>>();
    		
//     		for(int i = 0 ; i < nums.length ; i++) {
//     			Set<Integer> set = new HashSet<Integer>();
//     			for(int j = i + 1 ; j < nums.length ; j++) {
//     				int k = - (nums[i] + nums[j]);
//     				if(set.contains(k)) {
//     					List<Integer> list = Arrays.asList(nums[i],nums[j], k);
//     					Collections.sort(list);
//     					setList.add(list);
//     				}
//     				set.add(nums[j]);
//     			}
//     		}  
//     		List<List<Integer>> ans = new ArrayList<>(setList);
//     		return ans;
//     	}