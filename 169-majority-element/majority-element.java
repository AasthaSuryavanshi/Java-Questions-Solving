class Solution {
    public int majorityElement(int[] nums) {
        //hashmap creation
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        //hashmap key value pair filling
        for(int i=0; i<n; i++){
            if( map.containsKey(nums[i]) ){
                map.put( nums[i], map.get(nums[i]) + 1 );
            }else{
                map.put( nums[i], 1 );
            }
        }
        // iterating over hashmap
        for( int key : map.keySet() ){
            if( map.get(key) > n/2 ){
                // System.out.println(key);//
              return key;
            }
        }
    return -1;
    }
    
}