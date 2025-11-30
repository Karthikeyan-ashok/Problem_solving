class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        
        for(int i : nums)
        {
            total += i;
        }

        int rem = (int)(total%p);
        if(rem == 0)
        {
            return 0;
        }

        long sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            sum = (sum+nums[i])%p;
            if(sum<0)
            {
                sum += p;
            }
            int temp = (int)(sum-rem+p)%p;

            if(map.containsKey(temp))
            {
                ans = Math.min(ans,i-map.get(temp));
            }
            map.put((int)sum,i);
        }

        return ans==nums.length ? -1 : ans;
    }
}