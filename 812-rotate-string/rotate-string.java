class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        return false;
        String plus = s + s;
        return plus.contains(goal);

        //abcdeabcde   - bcdea  - true.


        // String s = "abcde";   using string builder
// StringBuilder sb = new StringBuilder();
// sb.append(s).append(s); // Append s twice
// String concatenated = sb.toString();
// System.out.println(concatenated);
    }
}