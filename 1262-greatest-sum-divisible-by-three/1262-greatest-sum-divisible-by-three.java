class Solution {
    public int maxSumDivThree(int[] nums) {
        int[]dp = new int[3];

        for(int num : nums)
        {
            int[]temp = dp.clone();
            for(int i : dp)
            {
                int sum = i+num;
                int ind = sum%3;
                temp[ind] = Math.max(temp[ind],sum);
            }
            dp = temp;
        }

        return dp[0];
    }
}