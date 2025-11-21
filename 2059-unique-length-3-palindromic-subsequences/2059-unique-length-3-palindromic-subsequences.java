class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;

        for(char ch = 'a';ch<='z';ch++)
        {
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            if(first!=-1 && last-first>1)
            {
                boolean[] arr = new boolean[26];
                for(int i=first+1;i<last;i++)
                {
                    arr[s.charAt(i)-'a'] = true;
                }

                for(boolean flag : arr)
                {
                    if(flag)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}