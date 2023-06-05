class Solution {
    public boolean isPalindrome(String s) {
        String resString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");
        char[] tempString = resString.toCharArray();
        int j = 0;
        for(int i = tempString.length - 1; i > 0; i--) {
            if(tempString[j] != tempString[i])
                return false;
            j++;
        }
        
        return true;
    }
}