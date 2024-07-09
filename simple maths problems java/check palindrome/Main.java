
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();
        sc.close();

        boolean pc = palindromeCheck(n);
        System.out.println(pc ? "palindrome" : "not palindrome");
    }

    static boolean  palindromeCheck(int n) {
        int dup = n;
        int revN = 0;
        while(n > 0){
            int ld = n % 10;
            n /= 10;
            revN = revN * 10 + ld;
        }
        return( dup == revN ? true : false );
    }
}
