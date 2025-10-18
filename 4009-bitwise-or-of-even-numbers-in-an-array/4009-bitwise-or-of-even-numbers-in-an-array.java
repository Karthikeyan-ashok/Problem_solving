class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int even = 0;

        for(int i : nums)
        {
            if(i%2==0)
            {
                even |= i;
            }
        }

        return even;
    }
}