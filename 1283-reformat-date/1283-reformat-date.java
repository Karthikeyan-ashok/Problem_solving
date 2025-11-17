class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        StringBuilder ans = new StringBuilder();

        ans.append(parts[2]);
        ans.append("-");

        switch(parts[1]) 
        {
            case "Jan":
                ans.append("01");
                break;
            case "Feb":
                ans.append("02");
                break;
            case "Mar":
                ans.append("03");
                break;
            case "Apr":
                ans.append("04");
                break;
            case "May":
                ans.append("05");
                break;
            case "Jun":
                ans.append("06");
                break;
            case "Jul":
                ans.append("07");
                break;
            case "Aug":
                ans.append("08");
                break;
            case "Sep":
                ans.append("09");
                break;
            case "Oct":
                ans.append("10");
                break;
            case "Nov":
                ans.append("11");
                break;
            case "Dec":
                ans.append("12");
                break;
        }

        ans.append("-");

        if(parts[0].length() == 3) 
        {
            ans.append('0');
            ans.append(parts[0].charAt(0));
        } else 
        {
            ans.append(parts[0].substring(0, 2));
        }

        return ans.toString();
    }
}