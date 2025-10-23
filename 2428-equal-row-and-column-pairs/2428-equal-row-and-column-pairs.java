class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String,Integer> map = new HashMap<>();

        for(int[] a : grid)
        {
            String s = Arrays.toString(a);
            map.put(s,map.getOrDefault(s,0)+1);
        }

        int count = 0;

        for(int i=0;i<n;i++)
        {
            int[] a = new int[n];
            for(int j=0;j<n;j++)
            {
                a[j] = grid[j][i];
            }
            String s = Arrays.toString(a);
            count += map.getOrDefault(s,0);
        }

        return count;
    }
}