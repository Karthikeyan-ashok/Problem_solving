class Solution {
    public long removeZeros(long n) {
        long ans = 0;
        long pos = 1;
        while(n!=0)
        {
            long rem = n%10;
            if(rem!=0)
            {
                ans += rem*pos;
                pos *= 10;
            }
            n /= 10;
        }

        return ans;
    }
}