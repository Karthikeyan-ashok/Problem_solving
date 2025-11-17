class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        for(int i : nums)
        {
            list.add(i);
        }

        int min = nums[0];
        int max = nums[nums.length-1];
        List<Integer> ans = new ArrayList<>();

        for(int i=min;i<max;i++)
        {
            if(!list.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}