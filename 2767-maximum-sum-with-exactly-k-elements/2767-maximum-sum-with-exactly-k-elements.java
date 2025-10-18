class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i : nums)
        {
            if(i>max)
            {
                max = i;
            }
        }

        int sum = 0;
        while(k>0)
        {
            sum += max;
            max++;
            k--;
        }

        return sum;
    }
}