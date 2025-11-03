class Solution {
    public int minCost(String s, int[] arr) {
        char[] ch = s.toCharArray();

        int ans = 0;
        int ind = 0;
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i]==ch[i-1])
            {
                ans += Math.min(arr[ind],arr[i]);
                if(arr[ind]<arr[i])
                {
                    ind = i;
                }
            }
            else
            {
                ind = i;
            }
        }

        return ans;
    }
}