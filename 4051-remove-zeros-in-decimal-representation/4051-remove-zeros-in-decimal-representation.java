class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);

        String a = s.replaceAll("0","");
        
        return Long.valueOf(a);
    }
}