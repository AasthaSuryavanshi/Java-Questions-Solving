class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            int t1 = 0, t2 = 0;
            if (n1 >= 0) {
                t1 = a.charAt(n1--) - '0';
            }
            if (n2 >= 0) {
                t2 = b.charAt(n2--) - '0';
            }
            int sum = t1 + t2 + carry;

            int value = sum % 2;
            carry = sum / 2;

            sb.append(value);  // Append the result of sum % 2
        }

        // Reverse and return the result as a string
        return sb.reverse().toString();
    }
}
