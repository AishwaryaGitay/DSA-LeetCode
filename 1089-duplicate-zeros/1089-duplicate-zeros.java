class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int a = 0 ; a < arr.length ; a++){
            if(arr[a] == 0){
                zeros++;
            }
        }

        int i = arr.length - 1;
        int j = arr.length - 1 + zeros;

        while(i >= 0){

            if(j < arr.length){   //copy i element to j element
                arr[j] = arr[i];
            }

            if(arr[i] == 0){
                j--;
                if(j < arr.length){
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}