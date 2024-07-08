import java.util.Scanner;

public class main {
        static void pattern1(int N) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("* ");
                }                
                System.out.println();
            }
        }


        static void pattern2(int N) {
            for (int i = 0; i < N; i++) {
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        static void pattern3(int N){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }


        static void pattern4(int N){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }


        static void pattern5(int N){
            for(int i=1; i<=N; i++){
                for(int j=N; j>=i; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        static void pattern6(int N){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N-i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }


        static void pattern7(int N){
            for(int i=0; i<N; i++){
                for(int j=0; j<N-i-1; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<2*i+1; j++){
                    System.out.print("*");
                }
                for(int j=0; j<N-i-1; j++){
                    System.out.print(" ");
                }

                System.out.println();
            }
        }


        static void pattern8(int N){
            for(int i=0; i<=N; i++){
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<2*N-2*i-1; j++){
                    System.out.print("*");
                }
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }

                System.out.println();
            }
        }


        static void pattern9(int N){
            for(int i=0; i<=N; i++){
                for(int j=0; j<N-i-1; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<2*i+1; j++){
                    System.out.print("*");
                }
                for(int j=0; j<N-i-1; j++){
                    System.out.print(" ");
                }
                System.out.println();

            }
            for(int i=0; i<=N; i++){

                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<2*N-2*i-1; j++){
                    System.out.print("*");
                }
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }

                System.out.println();
            }
        }


        static void pattern10(int N){
            for(int i=0; i<=N; i++){
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=0; i<=N; i++){
                for(int j=N; j>i; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        static void pattern11(int N){
            int start = 1;
            for(int i=0; i<=N; i++){
                if(i%2 == 0) start=0;
                else start=1; 
                for(int j=0; j<i; j++){
                    System.out.print(start+" ");
                    start=1-start;
                }
                System.out.println();
            }
        }


        static void pattern12(int N){
            for(int i=1; i<N; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                } 
                for(int j=1; j<2*N-2*i; j++){
                    System.out.print(" ");
                } 
                for(int j=i; j>1; j--){
                    System.out.print(j);
                } 
                System.out.println();
            }

        }


        static void pattern13(int N){
            int count = 1;
            for(int i=1; i<N; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(count+" ");
                    count++;
                } 
                
                System.out.println();
            }

        }


        static void pattern14(int N){
            for(int i=1; i<N; i++){
                for(char j='A'; j<='A'+i; j++){
                    System.out.print(j+" ");
                }                 
                System.out.println();
            }

        }


        static void pattern15(int N){
            for(int i=1; i<N; i++){
                for(char j='A'; j<='A'+(N-i-1); j++){
                    System.out.print(j+" ");
                }                 
                System.out.println();
            }

        }


        static void pattern16(int N){
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){
                    System.out.print((char)((int)('A'+i)) + " ");
                }                 
                System.out.println();
            }

        }
    

        static void pattern17(int N){
            for(int i=1; i<=N; i++){
                // for(int j=0; j<)
            }
        }
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            // pattern1(N);
            // pattern2(N); 
            // pattern3(N);
            // pattern4(N);
            // pattern5(N);
            // pattern6(N);
            // pattern7(N);
            // pattern8(N);
            // pattern9(N);
            // pattern10(N);
            // pattern11(N);
            // pattern12(N);
            // pattern13(N);
            // pattern14(N);
            // pattern15(N);
            pattern16(N);








        }
    
    
}
