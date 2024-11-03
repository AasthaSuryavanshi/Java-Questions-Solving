class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        //-----brute force
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=0 ; i<n ; i++){
        //     if(nums[i] != 0){
        //         arr.add(nums[i]);
        //     }
        // }
        // for(int i=0 ; i<arr.size() ; i++){
        //     nums[i] = arr.get(i);
        // }
        // for(int i=arr.size() ; i<n ; i++){
        //     nums[i] = 0 ;
        // }

        //--------------------- optimise
        int j=-1;
        for(int i=0; i<n ; i++){
            if(nums[i] == 0&& j==-1){
                j=i;
            }
        }
        int temp;
        for(int i=j+1 ; i<n ; i++){
            if(nums[i] != 0 ){
                if( j != -1){

                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                } 
            }else{
                if(j == -1){
                    j=i;
                }
            }
        }
    }
}