class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();

        for(int i : nums)
        {
            set.add(i);
        }

        int[]arr = new int[set.size()];
        int i = set.size()-1;
        for(int j : set)
        {
            arr[i--] = j;
        }
        if(arr.length<=k)
        {
            return arr;
        }

        return Arrays.copyOfRange(arr,0,k);
    }
}