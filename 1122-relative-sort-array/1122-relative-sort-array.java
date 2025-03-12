class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] ans = new int[arr1.length];
    		int max = Integer.MIN_VALUE;
    		for(int i = 0 ; i < arr1.length ; i++) {
    			max = Math.max(max, arr1[i]);
    		}
    		
    		int[] freq = new int[max+1];
    		
    		for(int i = 0 ; i < arr1.length ; i++) {
    			freq[arr1[i]]++;
    		}
    		
    		int index = 0;
    		for(int i = 0 ; i < arr2.length ; i++) {
    			while(freq[arr2[i]] > 0) {
    				ans[index] = arr2[i];
    				index++;
    				freq[arr2[i]]--;
    			}
    		}
    		
    		for(int i = 0 ; i < freq.length ; i++) {
    			
    			while(freq[i] > 0) {
    				ans[index] = i;
    				index++;
    				freq[i]--;
    			}
    		}
    		
    		return ans;
    }
}