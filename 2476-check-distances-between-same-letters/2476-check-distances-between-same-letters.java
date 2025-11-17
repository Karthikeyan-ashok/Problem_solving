class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++)
        {
            int ind = s.charAt(i)-'a';
            if(arr[ind]==-1)
            {
                arr[ind] = i;
            }
            else
            {
                int len = i-arr[ind]-1;
                if(len!=distance[ind])
                {
                    return false;
                }
            }
        }
        return true;
    }
}