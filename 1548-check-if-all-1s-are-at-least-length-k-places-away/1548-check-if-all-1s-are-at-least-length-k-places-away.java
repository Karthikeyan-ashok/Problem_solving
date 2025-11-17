class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        while(i<nums.length && nums[i]==0)
        {
            i++;
        }
        if(i==nums.length)
        {
            return true;
        }

        int j = i+1;
        int len = 0;

        while(i<nums.length && j<nums.length)
        {
            if(nums[j]==0)
            {
                len++;
                j++;
            }
            else
            {
                if(len<k)
                {
                    return false;
                }
                i = j;
                j = i+1;
                len = 0;
            }
        }
        return true;
    }
}