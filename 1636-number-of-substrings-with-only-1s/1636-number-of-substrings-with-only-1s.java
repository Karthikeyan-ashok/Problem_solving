class Solution {
    public int numSub(String s) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='1')
            {
                count++;
                sum += count;
                sum = (sum%1000000007);
            }
            else
            {
                count = 0;
            }
        }
        return sum;
    }
}