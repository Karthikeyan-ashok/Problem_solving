class Solution(object):
    def isPalindrome(self, x):
        if x<0 :
            return False

        temp = x
        num = 0
        while x>0 :
            rem = x%10
            num = (num*10)+rem
            x //= 10

        return num==temp