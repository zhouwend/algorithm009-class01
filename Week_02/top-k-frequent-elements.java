class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : nums) {
            if(m.containsKey(i)){
                m.get(i)++;
            }else{
                m.put(i,1);
            }
        }

    }
}