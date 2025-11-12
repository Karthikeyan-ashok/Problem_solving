class Solution(object):
    def singleNumber(self, nums):
        freq = {}
        for i in nums :
            freq[i] = freq.get(i,0) + 1
        
        ans = min(freq, key=freq.get)

        return ans 
        