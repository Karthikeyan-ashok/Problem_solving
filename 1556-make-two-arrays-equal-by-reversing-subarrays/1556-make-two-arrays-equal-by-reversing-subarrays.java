class Solution {
    public boolean canBeEqual(int[] targetArray, int[] currentArray) {
       
        int[] arr = new int[1001];
        int count = 0;
        
        for (int i = 0; i < targetArray.length; i++) 
        {
            if (arr[targetArray[i]]++ == 0) 
            {
                count++;
            }
            if (arr[currentArray[i]]-- == 1) 
            {
                count--;
            }
        }
        
        return count == 0;
    }
}