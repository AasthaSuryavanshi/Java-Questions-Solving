class Solution {
    public int maxFrequency(int[] nums, int k) {
        int res=1, start=0, end = 0;
        long sum = 0;
        Arrays.sort(nums);
        while(end < nums.length){    //nums.size() can not be used coz this method is available in collections
            sum += nums[end];
            end++;
            //when current sum + k is not reachable to ideal sum i.e max elem of window * length of window then shrink the window 
            if(k + sum < ( (long)nums[end - 1] * (end - start) )){
                sum -= nums[start];
                start++;
            }
            //or else update the max length of window if it is reachable
            res= Math.max(res,end-start);
        }
    return res;
    }
}