class Solution {

    public int[] findOrder(int n, int[][] p) 
    {
        List<List<Integer>> list = new ArrayList<>();
        int[] a = new int[n];

        for (int i=0;i<n;i++) 
        {
            list.add(new ArrayList<>());
        }

        for (int[] pair : p) 
        {
            int st = pair[0];
            int end = pair[1];
            list.get(end).add(st);
            a[st]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<n;i++) 
        {
            if (a[i]==0) 
            {
                q.offer(i);
            }
        }

        int[] ans = new int[n];
        int i = 0;

        while (!q.isEmpty()) 
        {
            int c = q.poll();
            ans[i++] = c;

            for (int k : list.get(c)) 
            {
                a[k]--;
                if (a[k]==0) 
                {
                    q.offer(k);
                }
            }
        }

        return i==n ? ans : new int[0];
    }
}