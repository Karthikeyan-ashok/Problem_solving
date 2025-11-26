class Solution {
    public int primePalindrome(int n) {
        if(n<=2)
        {
            return 2;
        }
        if(n<=3)
        {
            return 3;
        }
        if(n<=5)
        {
            return 5;
        }
        if(n<=7)
        {
            return 7;
        }
        if(n<=11)
        {
            return 11;
        }

        for(int i=1;i<=5;i++)
        {
            int l = (int)Math.pow(10,i-1);
            int r = (int)Math.pow(10,i);

            for(int j=l;j<r;j++)
            {
                String a = String.valueOf(j);
                String b = new StringBuilder(a.substring(0,a.length()-1)).reverse().toString();
                int num = Integer.parseInt(a+b);
                if(num>n && isPrime(num))
                {
                    return num;
                }
            }
        }
        return -1;
    }
    public boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        if(num==2)
        {
            return true;
        }
        if(num%2==0)
        {
            return false;
        }

        for(int i=3;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}