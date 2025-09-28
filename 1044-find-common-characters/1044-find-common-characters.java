class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : words[0].toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=1;i<words.length;i++)
        {
             Map<Character,Integer> temp = new HashMap<>();
             for(char ch : words[i].toCharArray())
             {
                if(map.containsKey(ch) && map.get(ch)>0)
                {
                    map.put(ch,map.get(ch)-1);
                    temp.put(ch,temp.getOrDefault(ch,0)+1);
                }
             }  
             map = temp;
        }
        List<String> list = new ArrayList<>();
        for(char ch : map.keySet())
        {
            int count = map.get(ch);
            for(int i=0;i<count;i++)
            {
                list.add(ch+"");
            }
        }
        return list;
    }
}