class Solution {
    public int removeDuplicates(int[] nums) {
        // //-----Brute for-----
        
        //  //create set and add unique value of arr to set
        // HashSet <Integer> set = new HashSet<>(); 
        // for(int t : nums){
        //     set.add(t);
        // }
        // //iterate over set n put value in arr
        // int indx = 0;
        // for(int it : set){
        //     nums[indx] = it;
        //     indx++;
        // }
        // return indx;



        //optimal with 2 pointer
        int i=0;
        for(int j=1; j<nums.length ; j++){
            if(nums[j] != nums[i] ){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;

        
    }
}