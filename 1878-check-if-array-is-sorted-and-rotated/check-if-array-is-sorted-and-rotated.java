class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int drop = 0;
        for(int i=0 ; i< n ; i++ ){
           if( nums[i] > nums[ (i + 1) % n]){
            drop++;
           }
           if(drop > 1){    // only 1 drop will be there in sorted rotated array
            return false;       // if more than 1 drops then the array is not srted and rotated
           }
        }
        return true;
    }
}