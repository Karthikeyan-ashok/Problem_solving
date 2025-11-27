class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long[]arr = new long[n+1];

        for(int i=0;i<n;i++)
        {
            arr[i+1] = arr[i]+nums[i];
        }

        long[]temp = new long[k];
        Arrays.fill(temp,Long.MAX_VALUE);

        long ans = Long.MIN_VALUE;

        for(int i=0;i<=n;i++)
        {
            int mod = i%k;

            if(temp[mod] != Long.MAX_VALUE)
            {
                ans = Math.max(ans,arr[i]-temp[mod]);
            }

            temp[mod] = Math.min(temp[mod],arr[i]); 
        }

        return ans;
    }
}