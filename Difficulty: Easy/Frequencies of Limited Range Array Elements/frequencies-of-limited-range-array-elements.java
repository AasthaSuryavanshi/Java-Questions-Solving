//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            // size of array
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to the array
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int P = Integer.parseInt(br.readLine().trim());
            // calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P);

            // printing array elements
            for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // Step 1: Reduce values greater than P to 0 (ignore values outside the valid range)
        for (int i = 0; i < N; i++) {
            if (arr[i] > P) {
                arr[i] = 0;
            }
        }

        // Step 2: Use the array itself to count frequencies
        for (int i = 0; i < N; i++) {
            if (arr[i] % (P + 1) > 0) { 
                int index = (arr[i] % (P + 1)) - 1; // Get the correct index for 1-based values
                if (index < N) {
                    arr[index] += (P + 1); // Increase the count by adding P+1
                }
            }
        }

        // Step 3: Extract the frequencies by dividing each element by P+1
        for (int i = 0; i < N; i++) {
            arr[i] /= (P + 1); // Get the frequency count for each element
        }
    }
}





