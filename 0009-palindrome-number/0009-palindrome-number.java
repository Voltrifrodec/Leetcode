class Solution {
    public boolean isPalindrome(int x) {
        String defaultString = Integer.toString(x);
        String reversedString = new StringBuilder(defaultString).reverse().toString();
        
        return defaultString.equals(reversedString);
    }
}