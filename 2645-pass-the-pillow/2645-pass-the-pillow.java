class Solution {
    public int passThePillow(int n, int time) {
        int i = 1;
        int j = 0;

        while(j<time)
        {
            while(j<time && i<n)
            {
                i++;
                j++;
                System.out.print(i+" ");
            }
            while(j<time && i>1)
            {
                i--;
                j++;
            }
        }
        return i;
    }
}