class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<String>();
        String temp = "";
        for(int i = 0; i < n; i++) {
            if((i + 1) % 3 == 0) {
                temp += "Fizz";
            }
            if((i + 1) % 5 == 0) {
                temp += "Buzz";
            }
            if(temp != "")
                result.add(temp);
            else
                result.add(Integer.toString(i + 1));

            temp = "";
            System.out.print(result.get(i) + " ");
        }
        System.out.println();

        return result;

    }
}