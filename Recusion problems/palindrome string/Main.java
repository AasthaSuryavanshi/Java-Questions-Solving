import java.util.Scanner;


public class Main {
    
    public static boolean palindrome(String str,int i){
    if (i >= str.length()/2) return true;
    if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
    return palindrome(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        sc.close();


        if (palindrome(str,0)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not a palindrome");
            
        };
    }
}
