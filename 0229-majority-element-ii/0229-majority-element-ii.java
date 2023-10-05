class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> uniqueValues = new HashMap<Integer, Integer>();

        for(int num : nums) {
            if(uniqueValues.containsKey(num)) {
                uniqueValues.put(num, uniqueValues.get(num) + 1);
            }
            else {
                uniqueValues.put(num, 1);
            }
        }

        List<Integer> values = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> value: uniqueValues.entrySet()) {
            int valueInt = value.getValue();
            if(valueInt > (nums.length / 3)) {
                values.add(value.getKey());
            }
        }


        return values;
    }
}