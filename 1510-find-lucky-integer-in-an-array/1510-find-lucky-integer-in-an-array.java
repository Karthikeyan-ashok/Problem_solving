class Solution {
    public int findLucky(int[] num) {
        int[] arr = new int[501];

        for(int i : num)
        {
            arr[i]++;
        }

        int ans = -1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==i)
            {
                ans = Math.max(i,ans);
            }
        }

        return ans;
    }
}