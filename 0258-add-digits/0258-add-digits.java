class Solution {
    public int addDigits(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        if(arr.length == 1)
            return num;
        int sum = 0;
        while(arr.length != 1) {
            sum = 0;
            for(char c : arr) {
                sum += Character.getNumericValue(c);
            }
            arr = Integer.toString(sum).toCharArray();
            System.out.println(arr.length + " " + sum);
        }
        
        return sum;
    }
}