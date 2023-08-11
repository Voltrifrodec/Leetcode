class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            result.add("");
            if((i + 1) % 3 == 0) {
                result.set(i, "Fizz");
            }
            if((i + 1) % 5 == 0) {
                result.set(i, result.get(i) + "Buzz");
            }
            else if(result.get(i) == "")
                result.set(i, Integer.toString(i + 1));

            // System.out.print(result.get(i) + " ");
        }
        // System.out.println();
        return result;
    }
}