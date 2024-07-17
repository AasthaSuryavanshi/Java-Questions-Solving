import java.util.Scanner;

public class Main {

    public static int[] reverseArrayWithSwapping(int[] array){
        int n = array.length;
        for(int i=0; i<n/2; i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        return array;
    }

    public static void reverseArrayRecusionWithTwoVariable(int[] array,int start, int end){
        if ( start >= end) {
            return;
        }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            reverseArrayRecusionWithTwoVariable(array, start+1, end-1);

    }

    
    public static void reverseArrayRecusionWithOneVariable(int[] array,int start){
        int end = array.length-start-1;
        if ( start >= end) {
            return;
        }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            reverseArrayRecusionWithOneVariable(array, start+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input of array size
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int [] array = new int[size];

        //input of array elements
        System.out.println("Enter the elements in array");
        for(int i = 0; i<size; i++){
            array[i]= sc.nextInt();
        }
        // traverse array elements
        System.out.println("Original array:");
        for( int i : array){
            System.out.println(i + " ");
        }
        sc.close();


        //reverse array with swapping
        int[] reverseArrayWithSwapping = reverseArrayWithSwapping(array);
        //reverse array of recusion with 2 variables
        reverseArrayRecusionWithTwoVariable(array, 0, array.length-1);
        //reverse array of recusion with 1 variables
        reverseArrayRecusionWithOneVariable(array, 0);



        // printing the reversed array
        System.out.println("reverse array:");
        for(int i : reverseArrayWithSwapping){
            System.out.println(i +" ");
        }

        // printing the reversed array with recusion with 2 variables
        System.out.println("reverse array:");
        for(int i : array){
            System.out.println(i +" ");
        }
    }
}
