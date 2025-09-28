class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1 = 0;
        for(char ch : firstWord.toCharArray())
        {
            sum1 = sum1*10+(ch-'a');
        }

        int sum2 = 0;
        for(char ch : secondWord.toCharArray())
        {
            sum2 = sum2*10+(ch-'a');
        }
        String s = String.valueOf(sum1+sum2);
        while(s.length()<targetWord.length())
        {
            s = "0"+s;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = (char)((targetWord.charAt(i)-'a')+'0');
            if(s.charAt(i)!=ch)
            {
                return false;
            }
        }
        return true;
    }
}