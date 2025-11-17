class Solution {
    String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String reformatDate(String date) {
        String[] temp = date.split("\\s+");
        String a = "";
        int j = 0;
        while(j<2)
        {
            if(Character.isDigit(temp[0].charAt(j)))
            {
                a += (temp[0].charAt(j));
            }
            j++;
        }
        if(a.length()<2)
        {
            a = "0"+a;
        }
        for(int i=0;i<12;i++)
        {
            if(temp[1].equals(month[i]))
            {
                if(i<9)
                {
                    a = "0"+(i+1)+"-"+a;
                }
                else
                {
                    a = (i+1)+"-"+a;
                }
            }
        }
        a = temp[2]+"-"+a;
        return a;
    }
}