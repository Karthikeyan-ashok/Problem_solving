class Solution {
    public int countAsterisks(String s) {
        String[]arr = s.split("\\|");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i+=2)
        {
            sb.append(arr[i]);
        }
        int count = 0;
        for(char ch : sb.toString().toCharArray())
        {
            if(ch=='*')
            {
                count++;
            }
        }

        return count;
    }
}