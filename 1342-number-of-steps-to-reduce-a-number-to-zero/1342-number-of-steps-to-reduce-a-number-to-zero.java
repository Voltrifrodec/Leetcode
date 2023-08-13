class Solution {
    public int numberOfSteps(int num) {

        byte steps = 0;
        while(num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            steps++;
        }

        // System.out.println(steps);
        return steps;
    }
}