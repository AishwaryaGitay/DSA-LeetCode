class Solution {
    public int[] sortEvenOdd(int[] nums) {

      PriorityQueue<Integer> even = new PriorityQueue<Integer>();
			PriorityQueue<Integer> odd = new PriorityQueue<Integer>((a,b) -> (b-a));
			
			for(int i = 0 ; i < nums.length ; i++) {
				if(i % 2 == 0) {
					even.add(nums[i]);
				} else{
					odd.add(nums[i]);
				}
			}
			
			for(int i = 0 ; i < nums.length ; i++) {
				if(i % 2 == 0) {
				   if(!even.isEmpty()) {
					   nums[i] = even.poll();
				   }
				} else {
					if(!odd.isEmpty()) {
					    nums[i] = odd.poll();
					}
				}
			}
			
			return nums;  
    }
}