class Solution {
    public void rotate(int[] nums, int k) {
        //--------------------brute---
        int n = nums.length;
         k = k % n; 
        ArrayList<Integer> arr = new ArrayList<>();
        //adding to temp
        for(int i=n-k ; i<n ; i++){
            arr.add(nums[i]);
        }
//shifting of elements
        for(int i=n-1 ; i>=k ; i--){
            nums[i] = nums[i-k];
        }
//puting back from temp to original array
         for (int i = 0; i < k; i++) {
            nums[i] = arr.get(i);
        }
    }
}