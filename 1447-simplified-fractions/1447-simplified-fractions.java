class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(gcd(j,i)==1)
                {
                    String s = i+"/"+j;
                    list.add(s);
                }
            }
        }
        return list;
    }
    public int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}