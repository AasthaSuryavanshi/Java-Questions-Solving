import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of array
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // precomputing
        int hash[] = new int[13];
        for(int i=0; i<size; i++){
            hash[arr[i]] += 1;
        }

        // for fetching qurey
        int q;
        System.out.println("Enter how many numbers u wanna check");
        q = sc.nextInt();

        while(q-- !=0){
            int number;
            System.out.println("Enter the number");
            number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
