class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] ans = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int pos = arr.length-1;

        while(start <= end){
            if(Math.abs(arr[start]) > Math.abs(arr[end])){
                ans[pos--] = arr[start] * arr[start];
                start++;
            } else {
                ans[pos--] = arr[end] * arr[end];
                end--;
            }
        }
        return ans;
    }
}