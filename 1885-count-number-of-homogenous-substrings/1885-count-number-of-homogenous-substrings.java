class Solution {
    public int countHomogenous(String s) {
        int sum = 0;
        int count = 0;

        int i = 0;
        while(i<s.length())
        {
            int j = i;
            while(j<s.length() && s.charAt(i)==s.charAt(j))
            {
                count++;
                sum += count;
                sum %= 1000000007;
                j++;
            }
            i = j;
            count = 0;
        }

        return sum;
    }
}