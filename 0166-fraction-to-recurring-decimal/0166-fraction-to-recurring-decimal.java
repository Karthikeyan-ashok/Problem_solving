class Solution {
    public String fractionToDecimal(int num, int den) {
        if(num==0)
        {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

         if ((num<0)^(den<0)) 
         {
            ans.append("-");
        }

        long n = Math.abs((long)num);
        long d = Math.abs((long)den);

        ans.append(n/d);
        long rem = n%d;

        if(rem==0)
        {
            return ans.toString();
        }

        ans.append(".");
        Map<Long,Integer> map = new HashMap<>();

        while(rem!=0)
        {
            if(map.containsKey(rem))
            {
                int ind = map.get(rem);
                ans.insert(ind,"(");
                ans.append(")");
                break;
            }

            map.put(rem,ans.length());
            rem *= 10;
            ans.append(rem/d);
            rem %= d;
        }

        return ans.toString();
    }
}