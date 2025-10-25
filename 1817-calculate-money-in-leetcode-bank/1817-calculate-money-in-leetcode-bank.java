class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int count = 1;
        int temp = count;
        for(int i=1;i<=n;i++)
        {
            total += count;
            count++;

            if(i%7==0)
            {
                temp++;
                count = temp;
            }
        }

        return total;
    }
}