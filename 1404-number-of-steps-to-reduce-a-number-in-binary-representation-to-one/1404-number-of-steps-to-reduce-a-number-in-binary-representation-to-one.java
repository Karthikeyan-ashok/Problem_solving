import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int count = 0;

        BigInteger n = new BigInteger(s,2);
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;

        while(!n.equals(one))
        {
            if(n.mod(two).equals(zero))
            {
                n = n.divide(two);
            }
            else
            {
                n = n.add(one);
            }
            count++;
        }
        return count;
    }
}