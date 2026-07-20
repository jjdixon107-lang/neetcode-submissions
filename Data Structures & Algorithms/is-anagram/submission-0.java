
class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Strings use .length(), not .length (which is for arrays)
        if (s.length() != t.length()) {
            return false;
        }

        // 2. The method is .toCharArray(), not .toArray()
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // 3. Sort the arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // 4. Compare the arrays (Arrays.equals checks content, sArray.equals(tArray) checks memory address)
        return Arrays.equals(sArray, tArray);
    }
}