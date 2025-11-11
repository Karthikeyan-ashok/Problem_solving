class Solution {
    public int numberOfChild(int n, int k) {
        int ans = 0;
        int pos = 1;

        for(int i=0;i<k;i++)
        {
            ans += pos;
            if(ans==n-1)
            {
                pos = -1;
            }
            else if(ans==0)
            {
                pos = 1;
            }
        }

        return ans;
    }
}