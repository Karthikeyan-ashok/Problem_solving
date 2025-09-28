class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int diff = arr[i]-arr[i-1];
            min = Math.min(min,diff);
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            int diff = arr[i]-arr[i-1];
            if(diff==min)
            {
                List<Integer>temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }
}