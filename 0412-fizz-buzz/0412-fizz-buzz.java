class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        String string;
        for(int i = 1; i <= n; i++) {
            string =  (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : (i % 3 == 0 ? "Fizz" : (i % 5 == 0 ? "Buzz" : Integer.toString(i)));
            result.add(string);
            // System.out.print(result.get(i - 1) + " ");
        }
        // System.out.println();
        return result;
    }
}