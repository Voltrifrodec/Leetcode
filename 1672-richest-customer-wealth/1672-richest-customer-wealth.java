class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0, temp = 0;
        for(int i = 0; i < accounts.length; i++) {
            temp = 0;
            for(int num: accounts[i]) {
                temp += num;
            }
            result = result < temp ? temp : result;
        }

        // System.out.println(result);
        return result;
    }
}