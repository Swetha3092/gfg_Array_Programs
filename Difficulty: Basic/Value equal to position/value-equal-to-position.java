class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer>bag=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==i+1)
            {
                bag.add(arr[i]);
            }
        }
        return bag;
    }
}
