class Solution {
    public boolean isPalindrome(String s) {
        String resString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");
        System.out.println("Replaced string: " + resString);
        char[] tempString = resString.toCharArray();
        int j = 0;
        for(int i = tempString.length - 1; i > 0; i--) {
            System.out.println("Matching " + tempString[j] + " and " + tempString[i]);
            if(tempString[j] != tempString[i])
                return false;
            j++;
        }
        
        return true;
    }
}