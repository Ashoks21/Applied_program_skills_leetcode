class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            // Append current least-significant bit into result.
            res = (res << 1) | (n & 1);

            // Unsigned right shift to avoid sign-bit propagation.
            n >>>= 1;
        }

        return res;
    }
}