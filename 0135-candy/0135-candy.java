class Solution {
    public int candy(int[] ratings) {
        
        int i = 1;
        int sum = 1;
        int peak = 1;
        int down = 1;

        while(i < ratings.length){
            if(ratings[i-1] == ratings[i]){
                sum = sum + 1;
                i++;
                continue;
            }

            peak = 1;
            while(i < ratings.length && ratings[i] > ratings[i-1]) {
                peak = peak + 1;
                sum = sum + peak;
                i++;
            }

            down = 1;
            while(i < ratings.length && ratings[i] < ratings[i-1]){
                sum = sum + down;
                down = down + 1;
                i++;
            }

            if(down > peak){
                sum = sum + (down - peak);
            }

        }

        return sum;
    }
}