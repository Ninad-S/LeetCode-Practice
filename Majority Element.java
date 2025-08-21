class Solution {
    public static Map<Integer, Integer> getElementFrequencies(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {
            
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                
                frequencyMap.put(element, 1);
            }
        }
        return frequencyMap;
    }
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = getElementFrequencies(nums);
        int maj = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > nums.length/2)
            {
                maj = entry.getKey();
            }
        }
        return maj;
    }
}
