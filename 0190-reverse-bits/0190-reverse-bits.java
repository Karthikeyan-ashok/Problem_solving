class Solution {
    public int reverseBits(int n) {
        StringBuilder s = new StringBuilder(Integer.toBinaryString(n)).reverse();
        while(s.length()<32)
        {
            s.append('0');
        }
        int ans = Integer.parseInt(s.toString(),2);
        return ans;
    }
}