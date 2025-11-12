class Solution {
    int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int one = 0;
        for(int i : nums)
        {
            if(i==1)
            {
                one++;
            }
        }

        if(one>0)
        {
            return n-one;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int a = nums[i];
            for(int j=i+1;j<n;j++)
            {
                a = gcd(a,nums[j]);
                if(a==1)
                {
                    min = Math.min(min,j-i+1);
                    break;
                }
            }
        }

        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }

        return (min-1)+(n-1);
    }
}