class Solution(object):
    def reverseBits(self, n):
        binary = bin(n)[2:]
        reverse = binary[::-1]

        while len(reverse)<32 :
            reverse = reverse + "0"

        num = int(reverse,2)

        return num
        