class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            }
            else {
                map.put(nums[i], i);
            }
            }
        return false;
    }
}
        /*
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length;j++) {
            if(nums[i] == nums[j] && Math.abs(i-j) <= k) {
                return true;
            }
        }
        }
        return false;
        */
