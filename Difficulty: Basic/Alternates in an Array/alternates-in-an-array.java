class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer>bag=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                bag.add(arr[i]);
            }
        }
        return bag;
    }
}