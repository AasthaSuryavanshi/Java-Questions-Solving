import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sc.close();

            List<Integer> divisors = printDivisors(n); 
            Collections.sort(divisors);
            System.out.println("arranged divisors: " + divisors);
        }

        static List<Integer> printDivisors(int n) {

            List<Integer> divisors = new ArrayList<>();
            for (int i=1; i<=Math.sqrt(n) ; i++){
                if ( n % i == 0 ){
                    divisors.add(i);
                    if ( n / i != i){
                        divisors.add(n/i);
                    }
                }
            }
            return divisors;
        }
}
