class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> dupe = new HashMap<>();
            for (int num : nums) {
                if (dupe.containsKey(num)) {
                    return true;
                } else {
                    dupe.put(num, false);
                }
            }
       return false;
    }
}
