class Solution {
    public int minChanges(String s) {
        ///-----brute - TC-O(n)  SC-O(n)
        // StringBuilder sb =  new StringBuilder(s);
        // int count=0;
        // for(int i=0 ; i<s.length() ; i+=2){
        //     if( s.charAt(i) != s.charAt(i+1)){
        //         sb.setCharAt( i+1 , s.charAt(i) );
        //         count++;
        //     }
        // }
        //--------------optimised TC-O(n)   SC-O(1)
        int count=0;
        for(int i=0 ; i<s.length() ; i+=2){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }

        return count;
    }
}