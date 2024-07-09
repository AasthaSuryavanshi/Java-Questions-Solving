import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int N = sc.nextInt();
        sc.close();

        int ReverseNo = ReverseNo( N );
        System.out.println(ReverseNo);

    }


    static int ReverseNo( int N ){
        int revNo = 0;
        boolean isNegative = N < 0 ? true : false;
        int absN = Math.abs(N);
        
        while( absN > 0){
            int ld = absN % 10;
            absN = absN/10;
            revNo = revNo * 10 + ld ;
        }
        return( isNegative ? -revNo : revNo);
    }
}




