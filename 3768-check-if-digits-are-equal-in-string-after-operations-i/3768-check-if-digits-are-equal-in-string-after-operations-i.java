class Solution {
    public boolean hasSameDigits(String s) {
        int[] arr = new int[s.length()];

        for(int i=0;i<s.length();i++)
        {
            arr[i] = s.charAt(i)-'0';
        }

        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j] = (arr[j]+arr[j+1])%10;
            }
        }

        return arr[0]==arr[1];
    }
}