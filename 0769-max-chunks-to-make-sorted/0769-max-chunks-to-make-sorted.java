class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int curr_max = -1;
        int result = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            curr_max = Math.max(curr_max, arr[i]);
            
            if(curr_max == i){
                result = result + 1;
            }
        }
        
        return result;
    }
}