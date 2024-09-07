import java.util.Scanner;

public class program {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] first = new String[size];
        int countA=0 , countB=0;
        for(int i=0; i<first.length; i++) {
            first[i] = sc.next();
        }

        for(int i=0; i<first.length; i++) {
            if(first[i].equals("teama")){
                countA++;
            }
            if(first[i].equals("teamb")){
                countB++;
            }
        }
        System.out.println(countA > countB ? "teama" : "teamb");
    }
}
