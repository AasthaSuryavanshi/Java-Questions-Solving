
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int N = sc.nextInt();
        sc.close();

        boolean check = checkPrime( N );
        System.out.println(check ? "prime no." : "not prime no.");
    }   
    
    static boolean  checkPrime(int N){
        int count = 0;
        for (int i = 1; i*i < N; i++){
            if (N % i == 0){
                count++;
                if (N/i != i){
                    count++;
                }
            }
        }
        return(count == 2 ? true : false);
    }
}
