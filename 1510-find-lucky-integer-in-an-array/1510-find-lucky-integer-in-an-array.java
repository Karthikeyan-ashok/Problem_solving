class Solution {
    public int findLucky(int[] num) {
        int[] arr = new int[501];

        for(int i : num)
        {
            arr[i]++;
        }

        
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]==i)
            {
                return i;
            }
        }

        return -1;
    }
}