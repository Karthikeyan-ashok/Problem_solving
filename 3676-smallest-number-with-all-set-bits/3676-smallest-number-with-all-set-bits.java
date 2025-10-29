class Solution {
    public int smallestNumber(int n) {
        int num = 0;
        int i = 0;
        while(num<=n)
        {
            num = (int)Math.pow(2,i);
            i++;
        }

        return num-1;
    }
}