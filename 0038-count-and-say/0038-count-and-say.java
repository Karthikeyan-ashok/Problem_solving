class Solution {
    public String countAndSay(int n) 
    {
        if (n==1) 
        {
            return "1";
        }
        String ans = "1";

        for (int i = 2; i <= n; i++) 
        {
            StringBuilder temp = new StringBuilder();
            int j = 0; 
            while (j<ans.length()) 
            {
                char ch = ans.charAt(j);
                int count = 1;

                while (j+1<ans.length() && ans.charAt(j+1)==ch) 
                {
                    count++;
                    j++;
                }
                
                temp.append(count);
                temp.append(ch);
                j++; 
            }
            ans = temp.toString(); 
        }
        
        return ans;
    }
}