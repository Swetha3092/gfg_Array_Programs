// User function Template for Java
class Solution {
    char firstRep(String S) {
        // your code here
        char[]a=S.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==' ')
            {
                continue;
            }
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                     return a[i];
                }
            }
        }
        return '#';
    }
}