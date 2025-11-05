class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int total = 0;
        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];

        prefixMax[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
        }


        suffixMax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
        }

        for(int index = 1 ; index < n ; index++){
            int leftMax = prefixMax[index];
            int rightMax = suffixMax[index];

            if(height[index] < leftMax && height[index] < rightMax) {
                total = total + Math.min(leftMax, rightMax) - height[index];
            }
        }

        return total;
    }
}