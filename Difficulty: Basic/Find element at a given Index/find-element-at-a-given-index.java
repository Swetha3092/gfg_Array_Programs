class Solution {
    public int findElementAtIndex(int i, int[] arr) {
        // code here
        int ans=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==arr[i])
            {
               ans=arr[i];
            }
        }
        return ans;
    }
}