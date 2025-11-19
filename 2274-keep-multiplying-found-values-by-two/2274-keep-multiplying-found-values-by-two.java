class Solution {
    public boolean multiply(int []arr,int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]) return true;
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        boolean flag = true;
        while(flag){
            if(multiply(nums,original)){
                original *= 2;
            }
            else{
                flag = false;
            }
        }
        return original;
    }
}