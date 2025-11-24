class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = Integer.MAX_VALUE;
        int p_count = 0;

        for(int i : divisors)
        {
            int count = 0;
            for(int n : nums)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==p_count)
            {
                ans = Math.min(i,ans);
            }
            else if(count>p_count)
            {
                ans = i;
                p_count = count;
            }
        }
        return ans;
    }
}