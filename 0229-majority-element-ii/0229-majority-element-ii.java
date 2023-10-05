class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> uniqueValues = new HashMap<Integer, Integer>();

        for(int num : nums) {
            System.out.print(num + " ");
            if(uniqueValues.containsKey(num)) {
                uniqueValues.put(num, uniqueValues.get(num) + 1);
            }
            else {
                uniqueValues.put(num, 1);
            }
        }
        System.out.println();

        List<Integer> values = new ArrayList<Integer>();
        // Useful links:
        //  - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#entrySet()
        //  - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.Entry.html
        for(Map.Entry<Integer, Integer> value: uniqueValues.entrySet()) {
            int valueInt = value.getValue();
            if(valueInt > (nums.length / 3)) {
                values.add(value.getKey());
                System.out.print(value.getValue() + "/" + value.getKey() + " ");
            }
        }
        System.out.println();


        return values;
    }
}