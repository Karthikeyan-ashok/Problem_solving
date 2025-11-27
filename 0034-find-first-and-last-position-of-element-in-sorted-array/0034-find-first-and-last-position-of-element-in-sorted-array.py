class Solution(object):
    def searchRange(self, nums, target):

        ans = []

        for i in range(len(nums)) :
            if nums[i]==target :
                ans.append(i)
                break

        for i in range(len(nums)-1,-1,-1) : 
            if nums[i]==target :
                ans.append(i)
                break
        
        if len(ans)==0 :
            return -1,-1
        else :
            return ans