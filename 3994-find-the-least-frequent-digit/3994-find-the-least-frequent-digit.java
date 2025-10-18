class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while(n!=0)
        {
            int rem = n%10;
            freq[rem]++;
            n /= 10;
        }
        int min = Integer.MAX_VALUE;
        int val = Integer.MAX_VALUE;
        for(int i=0;i<10;i++)
        {
            if(freq[i]!=0 && freq[i]<min)
            {
                min = freq[i];
                val = i;
            }
        }
        return val;
    }
}