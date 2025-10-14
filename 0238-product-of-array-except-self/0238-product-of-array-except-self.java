class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int j = nums.length - 1; j >= 0 ; j--){
            ans[j] = ans[j] * suffix;
            suffix = suffix * nums[j];
        }

        return ans;
    }
}


/* Logic Understanding Code
-------------------------------

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length];

        left[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length - 1] = 1;
        for(int j = nums.length - 2 ; j >=0 ; j--){
            right[j] = right[j+1] * nums[j+1];
        }
        
        for(int k = 0 ; k < ans.length ; k++){
            ans[k] = left[k] * right[k];
        }
        
        return ans;
    }
}

*/


