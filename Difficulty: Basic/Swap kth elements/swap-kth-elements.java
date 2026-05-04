
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
       int l=arr.get(k-1);
         int r=arr.get(arr.size()-k);
         arr.set(k-1,r);
         arr.set(arr.size()-k,l);
     
          
           
      
       
       
       
        
    }
}
