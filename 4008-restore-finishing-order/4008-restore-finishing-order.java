class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int[] freq = new int[n+1];

        for(int i : friends)
        {
            freq[i]++;
        }
        boolean[] b = new boolean[n+1];
        int[]ans = new int[friends.length];
        int ind = 0;
        for(int i=0;i<n;i++)
        {
            if(freq[order[i]]>0 && !b[order[i]])
            {
                ans[ind++] = order[i];
                b[order[i]] = true;
            }
        }
        return ans;
    }
}