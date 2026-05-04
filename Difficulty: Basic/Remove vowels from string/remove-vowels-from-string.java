// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder  a= new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='a'&& c!='e'&& c!='i' && c!='o'&& c!='u')
            {
                a.append(c);
            }
        }
        return new String(a);
    }
}