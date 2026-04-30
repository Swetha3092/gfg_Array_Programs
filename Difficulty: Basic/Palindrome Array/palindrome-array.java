class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int[]a=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            a[j++]=arr[i];
        }
       return  Arrays.equals(a,arr);
    }
}
