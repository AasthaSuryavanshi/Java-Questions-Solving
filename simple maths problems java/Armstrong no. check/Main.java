import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        boolean ans = armstong(n);
        System.out.println( ans ? "armstrong it is" : "armstrong not no.");
    }

    static boolean armstong(int n){
        int dup = n;
        int sum = 0;
        while (n > 0){
            int ld = n % 10;
            n /= 10;
            sum = sum + (ld*ld*ld);
        }
        return ( dup == sum ? true : false);
    }


}
