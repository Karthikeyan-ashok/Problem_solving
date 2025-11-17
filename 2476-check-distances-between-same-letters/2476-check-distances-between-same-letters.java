class Solution {
    public boolean checkDistances(String s, int[] distance) {
        boolean[] ar = new boolean[26];

        int i = 0;
        

        while(i<s.length())
        {
            int j = i+1;
            
            while(!ar[s.charAt(i)-'a'] && j<s.length() && s.charAt(i)!=s.charAt(j))
            {
                j++;
            }
            if(!ar[s.charAt(i)-'a'])
            {
                ar[s.charAt(i)-'a'] = true;
                System.out.print(j);
                int len = j-i-1;

                int d = distance[s.charAt(i)-'a'];
                if(len!=d)
                {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}