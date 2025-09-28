class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = (int)(arr.length * 0.05);
        List<Integer> list = new ArrayList<>();
        for(int i : arr)
        {
            list.add(i);
        }

        for(int i=0;i<n;i++)
        {
            list.remove(0);
            list.remove(list.size()-1);
        }
        double sum = 0;
        for(int i : list)
        {
            sum += i;
        }

        return (double)(sum/list.size());
    }
}