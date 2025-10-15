class Solution {
    public void moveZeroes(int[] a) {
        // int temp[]=new int[nums.length];
        // int j = 0;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         temp[j++] = nums[i];
        //     }
        // }
        // // while(j<nums.length){
        // //     temp[j++] = 0;
        // // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=temp[i];
        // }
        // Arrays.toString(nums)
        for (int i = 0, j = 0; i < a.length; i++) 
        {
            if (a[i] != 0) 
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
}