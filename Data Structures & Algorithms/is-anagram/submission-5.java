class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedS = new String(charArray);
        charArray = t.toCharArray();
        Arrays.sort(charArray);
        String sortedT = new String(charArray);

        if (sortedS.equals(sortedT)) {
            return true;
        }

        return false;
    }
}
