class Solution {
    public int thirdMax(int[] nums) {
        
       Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = (long) num;

            if ((first != null && n == first) ||
                    (second != null && n == second) ||
                    (third != null && n == third)) {
                continue;
            }

            if(first == null || n > first){
                third = second;
                second = first;
                first = n;
            } else if(second == null || n > second){
                third = second;
                second = n;
            } else if(third == null || n > third){
                third = n;
            }
        }

        if (third == null) return first.intValue();
        return third.intValue();
    }

/*
    public int thirdMax(int[] nums) {
        // TreeSet with reverse order (largest first)
        TreeSet<Integer> top3 = new TreeSet<>(Collections.reverseOrder());
        
        // Add all elements (duplicates automatically removed)
        for (int num : nums) {
            top3.add(num);
            
            // Keep only top 3
            if (top3.size() > 3) {
                top3.pollLast(); // Remove smallest of top 3
            }
        }
        
        // If we have 3 elements, return the last (3rd max)
        // Otherwise, return first (1st max)
        return top3.size() == 3 ? top3.last() : top3.first();
    }
    */
}