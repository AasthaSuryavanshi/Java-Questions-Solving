class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1= nums1.length, n2=nums2.length;
        int i=0,j=0;
        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                // Add to ans if it is the first occurrence
                if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {    // checks for the last ement in ans and first elem of ans to be added to avoid duplicate elements.
                //we could use ans. contains but this method has time complexity of O(n- size of ans array) so the method used is more efficient
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        //converting arraylist to array
        int[] result = new int[ans.size()];
       for(int k=0 ; k< ans.size(); k++){
        result[k] = ans.get(k);
       }
        return result;
    }
}

//tc- O(n1logn1+n2logn2)- sorting
// +O(n1+n2) - traversal
// sc - O(min(n1,n2))