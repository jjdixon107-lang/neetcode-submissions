class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int difference = target - nums[i];
                if (sum.containsKey(difference)) {
                    return new int[] {sum.get(difference), i};
                }
        
            sum.put(nums[i], i);

            }

            return null;
    }
}

        