class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        Map<Integer, Queue<Integer>> indexes = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            indexes.putIfAbsent(nums2[i], new LinkedList<>());
            indexes.get(nums2[i]).add(i);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        Queue<Integer> unusedNumbers = new LinkedList<>();

        while(i < n && j < n){
            if(nums1[i] > nums2[j]){
                int ind = indexes.get(nums2[j]).poll();
                result[ind] = nums1[i];
                j++;
            } else{
                unusedNumbers.add(nums1[i]);
            }
            i++;
        }
        
        for(int k = 0 ; k < n ; k++){
            if(result[k] == -1){
                result[k] = unusedNumbers.poll();
            }
        }

        return result;
    }
}