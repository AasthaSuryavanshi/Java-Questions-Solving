import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        Long A = sc.nextLong();
        Long B = sc.nextLong();

        sc.close();
        Long[] result = lcmAndGcd(A, B);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);


    }

        static Long[] lcmAndGcd(Long A , Long B) {
            // code here
            List<Long> number = new ArrayList<>();
            
            Long gcd = findgcd(A,B);
            Long lcm = (A*B)/gcd;
            number.add(lcm);
            number.add(gcd);
            return number.toArray(new Long[0]);           
           
        }
                
            static Long findgcd(Long A, Long B){
                
            while(A>0 && B>0){
                if(A>B){
                    A=A%B;
                }else{
                    B= B%A ;}
            }
            return(A==0 ? B : A);
            }
    };

