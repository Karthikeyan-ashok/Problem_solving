class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] freq = new int[101];

        for(int i : nums)
        {
            freq[i]++;
        }
        int i;
        for(i=k;i<=100;i+=k)
        {
            if(freq[i]==0)
            {
                return i;
            }
        }
        return i;
    }
}