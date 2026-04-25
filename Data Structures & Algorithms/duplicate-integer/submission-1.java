class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> valueCountMap = new HashSet<>(); //Stores values to check if the value is already exists.

        for (int i = 0; i < nums.length; i++) {
            if(valueCountMap.contains(nums[i]))
                return true;

            valueCountMap.add(nums[i]);
        }
        return false;
    }
}