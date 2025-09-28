class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // int sum = 0;
        // for(int i : costs)
        // {
        //     sum += i;
        // }
        // if(sum<=coins)
        // {
        //     return costs.length;
        // }

        Arrays.sort(costs);
        int i = 0;
        int j = 0;
        int sum = 0;
        int len = 0;
        while(j<costs.length)
        {
            sum += costs[j];
            while(sum>coins)
            {
                sum -= costs[i];
                i++;
            }
            len = Math.max(j-i+1,len);
            j++;
        }
        return len;
    }
}