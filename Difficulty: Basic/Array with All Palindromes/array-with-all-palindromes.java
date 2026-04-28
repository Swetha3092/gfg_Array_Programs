class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0;i<arr.length;i++)
        {
            if(!pal(arr[i]))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean pal(int n)
    {
        int rev=0,orgno=n;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
        if(rev==orgno)
        {
            return true;
        }
        return false;
    }
}