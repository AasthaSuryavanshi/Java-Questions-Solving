
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("enter N");
        int N = sc.nextInt();
        // infiniteRess();
        normalRes();
        printGfg(N);
    }
    static void infiniteRess(){
        System.out.println("1");
        infiniteRess();
    }


    static  int count = 0;
    public static  void normalRes(){
        if(count == 5) return;
        System.out.println(count);
        count++;
        normalRes();
    }


    static int flag = 1;
    static void printGfg(int N) {
        // code here
        if(flag > N) return;
        System.out.print("GFG"+" ");
        flag++;
        printGfg(N);
    }
}

