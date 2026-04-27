// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        
       char[]a=s.toCharArray();
       
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='A' && a[i]<='Z')
            {
                a[i]+=32;
            }
        }
        return new String(a);
    }
}