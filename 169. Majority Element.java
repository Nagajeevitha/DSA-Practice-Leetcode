class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums)
            hm.put(num, hm.getOrDefault(num,0)+1);
        
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(nums.length/2 < e.getValue())
                return e.getKey();
        }
        return -1;
    }
}
