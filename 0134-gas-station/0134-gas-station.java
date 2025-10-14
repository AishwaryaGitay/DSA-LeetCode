class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0;
        int costTotal = 0;
        for(int i = 0 ; i < gas.length ; i++){
            gasTotal = gasTotal + gas[i];
            costTotal = costTotal + cost[i];
        }

        if(gasTotal < costTotal){
            return -1;
        }

        int gasFilled = 0;
        int possAns = -1;
        for(int i = 0 ; i < gas.length ; i++){
            gasFilled = gasFilled + gas[i];

            if(gasFilled - cost[i] < 0){
                gasFilled = 0;
                possAns = -1;
            } else{
                gasFilled = gasFilled - cost[i];
                if(possAns == -1) {
                    possAns = i;
                }
            }
        }
        
        return possAns;
    }
}