import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int N = sc.nextInt();
        sc.close();

        countDigits( N );
        twomethod( n );
        evenlyDivides(N);             //Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
    }


    static void countDigits( int N ){
        int count = 0;

        while( N > 0){
            count++;                        
            N = N/10;
        }
        System.out.println("no of digits: " + count);
    }


    static void twomethod( int n ){
        int count = (int) ( Math.log10(n) +1);               //typecast to int and use math package to use log in java

        
        System.out.println("no of digits: " + count);
    }



        static int evenlyDivides(int N){
            // code here
            
            int count = 0;
            int originalNo = N;
            while( N > 0 ) {
                int lastdigit = N % 10;
                if( lastdigit != 0 && originalNo % lastdigit == 0){
                    count++;
                }
                N = N / 10;
                // else {return};
            }
            return count;
        }
    
}
