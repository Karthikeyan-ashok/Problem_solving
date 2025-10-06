class Solution {
    static String arr[] =  {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void combination(String a, String b, List<String> ans)
    {
        if(a.length()==0)
        {
           ans.add(b);
           return;
        }
        char ch = a.charAt(0);
        if(ch<'2' || ch>'9')
        {
            return;
        }
        String tem = arr[ch-'0'];
        for(int i=0;i<tem.length();i++)
        {
            combination(a.substring(1),b+tem.charAt(i),ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0)
        {
            return ans;
        }
        combination(digits,"",ans);
       
        return ans;
    }
}