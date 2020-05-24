class TwoSum {
    public int[] TwoSum(int[] nums, int target) {
        Map<Integer,Integer> retMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(retMap.containsKey(target - nums[i])) {
                return new int[]{retMap.get(target - nums[i]), i};
            }
            retMap.put(nums[i],i);
        }
        return null;
    }
}