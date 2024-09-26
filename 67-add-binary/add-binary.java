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





// ---------------efficient solution

// class Solution {
//     public String addBinary(String a, String b) {
//         StringBuilder result = new StringBuilder();
//         int i = a.length() - 1, j = b.length() - 1, carry = 0;

//         while (i >= 0 || j >= 0 || carry != 0) {
//             int sum = carry;
//             if (i >= 0) sum += a.charAt(i--) - '0';  // Add bit from string a
//             if (j >= 0) sum += b.charAt(j--) - '0';  // Add bit from string b

//             result.append(sum % 2);  // Append the result of sum mod 2 (0 or 1)
//             carry = sum / 2;         // Update carry for the next iteration
//         }

//         return result.reverse().toString();  // Reverse and return the final binary string
//     }
// }
