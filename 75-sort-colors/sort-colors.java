class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        int count0 = map.getOrDefault(0, 0);
        while(count0 > 0){
            nums[index++] = 0;
            count0--;
        }

        int count1 = map.getOrDefault(1, 0);
        while(count1 > 0){
            nums[index++] = 1;
            count1--;
        }

        int count2 = map.getOrDefault(2, 0);
        while(count2 > 0){
            nums[index++] = 2;
            count2--;
        }
    }
}