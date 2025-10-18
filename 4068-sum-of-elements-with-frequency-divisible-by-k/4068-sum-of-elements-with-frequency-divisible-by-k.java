class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i : nums)
        // {
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }

        // int sum = 0;
        // for(int i : map.keySet())
        // {
        //     int freq = map.get(i);
        //     if(freq%k==0)
        //     {
        //         sum += (i*freq);
        //     }
        // }

        // return sum;

        int max = 0;
        for(int i : nums)
        {
            if(i>max)
            {
                max = i;
            }
        }
        int[] freq = new int[max+1];
        for(int i : nums)
        {
            freq[i]++;
        }
        int sum = 0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0 && freq[i]%k==0)
            {
                sum += (i*freq[i]);
            }
        }

        return sum;
    }
}