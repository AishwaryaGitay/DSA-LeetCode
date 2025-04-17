class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int total = n - 2;
        int pivot = -1;

        for(int i = total; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot >= 0){
            int j = n - 1;
            for(int i = j ; i >= 0 ; i--){
                if(nums[i] > nums[pivot]){
                    swap(nums,i,pivot);
                    break;
                }
            }
        }

        reverseArr(nums, pivot + 1, n - 1);
    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public void reverseArr(int[] arr, int start, int end){

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}