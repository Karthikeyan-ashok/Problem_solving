class Solution {
    public int minimumSum(int num) 
    {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int n1 = ((ch[0]-'0')*10)+(ch[2]-'0');
        int n2 = ((ch[1]-'0')*10)+(ch[3]-'0');

        return n1+n2;
    }
}