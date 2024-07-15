import java.util.Scanner;

public class Main {
// functional approch
    public static int sum(int n ){
        if(n == 0) return 0;
        return n + sum( n - 1);
    }

    // parameterized approach
    public static void sumP(int n,int s){
        if (n<1) {
            System.out.println(s);
            return;
        }
        sumP(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no uptil u want sum");
        int n = sc.nextInt();
        sc.close();



        // -- for functional approach
        int ans = sum(n);
        System.out.println(sum(n));



        // -- for parameterizes approach
        sumP(n, 0);
    }
}