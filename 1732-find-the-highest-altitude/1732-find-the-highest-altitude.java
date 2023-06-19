class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int temp = start;
        
        for(int i : gain) {
            start += i;
            temp = Math.max(temp, start);
            System.out.println(start + " " + temp);
        }
        
        return temp;
    }
}