class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int diff;
        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(map.containsKey(diff)){
                ans[0]=map.get(diff);
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}