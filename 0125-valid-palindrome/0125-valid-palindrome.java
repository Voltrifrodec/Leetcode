class Solution {
    public boolean isPalindrome(String s) {
        char[] resString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "").toCharArray();
        int j = 0;
        for(int i = resString.length - 1; i > 0; i--) {
            if(resString[j] != resString[i])
                return false;
            j++;
        }
        
        return true;
    }
}