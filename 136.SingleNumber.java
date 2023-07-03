class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums)
        result^=num;
        return result;
    }
    /****. Use of HashMap ******/
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            int frequency = map.getOrDefault(num, 0) + 1;
            map.put(num, frequency);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }
}
