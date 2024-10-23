//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution {

    // Function to sort an array using the quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // Only proceed if the subarray has more than one element
        if (low < high) {
            // Partition the array and get the pivot index
            int pInx = partition(arr, low, high);
            
            // Recursively sort the left and right subarrays
            quickSort(arr, low, pInx - 1);  // Elements before pivot
            quickSort(arr, pInx + 1, high); // Elements after pivot
        }
    }

    // Function to partition the array
    static int partition(int arr[], int low, int high) {
        // Choose the pivot (commonly the first element in this case)
        int pivot = arr[low];  
        int i = low;  // Start pointer
        int j = high; // End pointer
        int temp;

        // Loop until the two pointers cross
        while (i < j) {
            // Move i to the right until we find an element larger than the pivot
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            // Move j to the left until we find an element smaller than the pivot
            while (arr[j] > pivot && j > low) {
                j--;
            }
            // If i and j haven't crossed, swap the elements at i and j
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place the pivot in its correct position
        temp = arr[low];  // Swap pivot with arr[j]
        arr[low] = arr[j];
        arr[j] = temp;

        // Return the index of the pivot
        return j;
    }
}
