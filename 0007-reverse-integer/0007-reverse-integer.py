class Solution(object):
    def reverse(self, x):
        sign = -1 if x < 0 else 1
        ans = 0
        x = abs(x)

        while x != 0:
            rem = x%10
            ans = (ans*10)+rem
            x //= 10

        ans = ans*sign
        if ans>2**31-1 or ans<-2**31 :
            return 0
        
        return ans
        