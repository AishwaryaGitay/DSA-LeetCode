class Solution {
    public void rotate(int[] nums, int k) {
      // Reversal Algorithm Logic
      // Reverse the last k elements -> reverse(nums, n-k, n-1)
      // Reverse the remaining n - k elements -> reverse(nums, 0, n-k-1)
      //Reverse the whole array -> reverse(nums, 0, n - 1) 
        
        int n = nums.length;
        if(k == 0 || k % n == 0){
            return;
        }
        
        k = k % n;
        
        reverseArray(nums, n-k, n-1);  // Reverse last k elements
		reverseArray(nums, 0, n-k-1);  // Reverse the rest
		reverseArray(nums, 0 , n-1);   // // Reverse the whole array
    }

    static void reverseArray(int[] arr, int start, int end){
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    // this also applies for counterclockwise rotation of array
    // example - 
    /* Input: arr[] = [1, 2, 3, 4, 5], d = 2
     Output: [3, 4, 5, 1, 2]
     Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
     */

    // Same method - 
    /* Reversal Algorithm Logic
     1. Reverse the first d elements → reverse(arr, 0, d - 1)
     2. Reverse the remaining n - d elements → reverse(arr, d, n - 1)
     3. Reverse the whole array → reverse(arr, 0, n - 1)
     */


     //Code below for counter clockwise rotation

 /*   static void rotateArr(int arr[], int d) {
        
        //reversal algorithm.
        
        int n = arr.length;
        if(d == 0 || d % n == 0){
            return;
        }
        
        d = d % n;
        
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0 , n-1);
    }
    
    static void reverseArray(int[] arr, int start, int end){
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }  */
}