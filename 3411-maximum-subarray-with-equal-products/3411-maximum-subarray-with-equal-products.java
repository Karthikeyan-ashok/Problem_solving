class Solution {
    public int maxLength(int[] nums) {
        
        int n = nums.length;
        int len = 1;

        for(int i=0;i<n;i++)
        {
            long sum = 1;
            int g = 0;
            int l = 1;
            for(int j=i;j<n;j++)
            {
                sum *= nums[j];
                g = gcd(g,nums[j]);
                l = lcm(l,nums[j]);

                if(sum == 1L*g*l)
                {
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public int lcm(int a, int b)
    {
        return a/gcd(a,b)*b;
    }
}