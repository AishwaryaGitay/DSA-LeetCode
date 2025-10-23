class Solution {
    public int findDuplicate(int[] nums) {
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

        for(int a = 0 ; a < n ; a++){
            if(nums[a] != a+1){
                return nums[a];
            }
        }
        
        return -1;

    }


    private void swapNums(int i, int correctIndex, int[] numbers) {

        int temp = numbers[i];
        numbers[i] = numbers[correctIndex];
        numbers[correctIndex] = temp;
    }
}