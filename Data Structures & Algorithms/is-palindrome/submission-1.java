class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuilder(filtered).reverse().toString();

        if (reverse.toLowerCase().equals(filtered.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
