class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : nums) 
        {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) 
        {
           if (entry.getValue()==1)
                return entry.getKey();
        }
        return -1;
    }
}
