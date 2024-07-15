import java.util.Scanner;

public class Main {
        // functional approch
        public static int factorail(int n){
            if(n == 0) return 1;
            return n * factorail(n-1);
        }


        // -- for parameterizes approach
    public static void fact(int n, int f){
        if(n<1){
            System.out.println(f);
            return;
        }
        fact(n-1,f*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no uptil u want to find factorial");
        int n = sc.nextInt();
        sc.close();


        // -- for parameterizes approach
        fact(n,1);

        // functional approch
        int ans = factorail(n);
        System.out.println(ans);

    }
}
