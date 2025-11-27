class Solution(object):
    def searchRange(self, nums, target):

        ans = [-1,-1]

        for i in range(len(nums)) :
            if nums[i]==target :
                ans[0] = i
                break

        for i in range(len(nums)-1,-1,-1) : 
            if nums[i]==target :
                ans[1] = i
                break
        
        return ans