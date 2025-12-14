class Solution {
    public int minimumFlips(int n) {

        String a = Integer.toBinaryString(n);
        String s = new StringBuilder(a).reverse().toString();

        
        int count = 0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) != s.charAt(i))
            {
                count++;
            }
        }
        return count;

    }
}