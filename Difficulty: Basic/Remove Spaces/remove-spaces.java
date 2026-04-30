class Solution {
    String removeSpaces(String s) {
        // code here
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}