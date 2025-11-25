class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1) 
        {
            return false;
        }
        
        String temp = s+s;
        String str = temp.substring(1,temp.length()-1);

        return str.contains(s);
    }
}