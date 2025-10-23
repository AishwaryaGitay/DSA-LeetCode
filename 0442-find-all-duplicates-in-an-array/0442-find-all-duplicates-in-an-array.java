class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
       
        int n = nums.length;
        int i = 0;

        while(i < n){

            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swapNums(i, correctIndex, nums);
            }
            else{
                i++;
            }
        }

        for(int j = 0 ; j < n ; j++){
            if(nums[j] != j+1){
                result.add(nums[j]);
            }
        }
        return result;
    }

    private void swapNums(int a, int b, int[] nums){

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}