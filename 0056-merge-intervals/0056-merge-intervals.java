class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int m = intervals.length;
        int n = intervals[0].length;

        int[][] merged = new int[m][n];

        int start = intervals[0][0];
        int end = intervals[0][1];
        int j = 0;

        for(int i = 1; i < intervals.length ; i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if(end >= currStart){
                end = Math.max(end, currEnd);
            }else{
                merged[j] = new int[]{start, end};
                start = currStart;
                end = currEnd;
                j++;
            }
        }

        merged[j] = new int[]{start, end};

        return Arrays.copyOf(merged,j+1);
        
    }
}