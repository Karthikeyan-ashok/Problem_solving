class Solution(object):
    def lengthOfLastWord(self, s):
        
        t = s.strip()
        count = 0
        for i in range(len(t)-1,-1,-1) :
            if(t[i]==' ') :
                break
            else :
                count = count+1

        return count