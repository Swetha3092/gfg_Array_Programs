class Solution {
    int convertfive(int num) {
        // Your code here
        String ans=""+num;
        char[]a=ans.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='0')
            {
                a[i]='5';
            }
        }
        String res=new String(a);
        return Integer.parseInt(res);
        
    }
}