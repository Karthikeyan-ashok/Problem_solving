class Solution(object):
    def singleNumber(self, nums):
        
        num = 0

        for i in range(len(nums)) :
            num ^= nums[i]
        
        return num