class Solution {
    public int heightChecker(int[] heights) {
        
        int[] heightFreq = new int[101];
            
            for (int height : heights) {
            	heightFreq[height]++;
            }
            
            int result = 0;
            int heightVal = 0;
            
            for (int i = 0; i < heights.length; i++) {
                while (heightFreq[heightVal] == 0) {
                	heightVal++;
                }
                
                if (heightVal != heights[i]) {
                    result++;
                }
                heightFreq[heightVal]--;
            }
            
            return result;
    }
}