class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int len = (int)Math.pow(10,(int)Math.log10(nums[i]));
                int a = nums[i]/len;
                int b = nums[j]%10;
                if(gcd(a,b)==1)
                {
                    count++;
                }
            }
        }

        return count;
    }
    public int gcd(int a, int b)
    {
        return b==0 ? a : gcd(b,a%b);
    }
}