class Solution {
    public int minTimeToVisitAllPoints(int[][] a) {
        int ans = 0;

        for(int i=1;i<a.length;i++)
        {
            ans += Math.max((Math.abs(a[i][0]-a[i-1][0])),(Math.abs(a[i][1]-a[i-1][1])));
        }

        return ans;
    }
}