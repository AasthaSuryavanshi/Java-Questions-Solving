class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        

        int n = word.length();
        int prefix = 1 ;
        for(int i =0 ; i<n ; i++){
        
            if( i < n-1 && word.charAt(i) == word.charAt(i+1) && prefix < 9 ){
                prefix++;
            }else{
                sb.append(prefix).append(word.charAt(i));
                prefix=1;
            }
            
        }
        return sb.toString();
    }
}
                //sb.append(prefix + word.charAt(i)); /// giving aski value of word.charAt(i)