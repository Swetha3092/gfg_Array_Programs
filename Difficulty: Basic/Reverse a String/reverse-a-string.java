// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[]a=s.toCharArray();
        int l=0,r=a.length-1;
        while(l<r)
        {
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return new String(a);
    }
}