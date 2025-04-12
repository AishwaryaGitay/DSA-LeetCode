public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;       // extracting the last bit
            result = (result << 1) | bit;  // append the bit to the result
            n = n >>> 1;         // right-shift for the next bit
        }
        return result;
    }
}