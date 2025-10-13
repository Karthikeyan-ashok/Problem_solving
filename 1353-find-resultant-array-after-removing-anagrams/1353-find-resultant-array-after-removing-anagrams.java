class Solution {
    public boolean isAnagram(String a,String b)
    {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String temp = "";

        for(int i=0;i<words.length;i++)
        {
            if(!isAnagram(temp,words[i]))
            {
                list.add(words[i]);
            }
            temp = words[i];
        }

        return list;
    }
}