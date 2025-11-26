class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][]dp = new int[m][n][k];

        dp[0][0][grid[0][0]%k] = 1;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int r=0;r<k;r++)
                {
                    if(i>0)
                    {
                        int sum = (r+grid[i][j])%k;
                        dp[i][j][sum] = (dp[i][j][sum] + dp[i-1][j][r])%1000000007;
                    }
                    if(j>0)
                    {
                        int sum = (r+grid[i][j])%k;
                        dp[i][j][sum] = (dp[i][j][sum] + dp[i][j-1][r])%1000000007;
                    }
                }
            }
        }

        return dp[m-1][n-1][0];
    }
}