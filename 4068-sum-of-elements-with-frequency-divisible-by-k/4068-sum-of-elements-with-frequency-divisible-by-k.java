class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int sum = 0;
        for(int i : map.keySet())
        {
            int freq = map.get(i);
            if(freq%k==0)
            {
                sum += (i*freq);
            }
        }

        return sum;
    }
}