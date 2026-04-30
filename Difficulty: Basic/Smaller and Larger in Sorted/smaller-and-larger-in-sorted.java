class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int[]a=new int[2];
        int s=0,l=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=target)
            {
                s++;
            }
            if(arr[i]>=target)
            {
                l++;
            }
        }
        a[0]=s;
        a[1]=l;
        return a;
    }
}