
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array input
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // precomputation
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            int key = arr[i];
            int freq = 0;
            if(map.containsKey(key))
            freq = map.get(key);
            freq++;
            map.put(key,freq);
        }



        // for itration through hashmap
        for(Map.Entry<Integer,Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " --> " + item.getValue());
        }



        // for fetching queries
        int q=sc.nextInt();
        while(q--!=0){
            int num;
            num = sc.nextInt();
            if(map.containsKey(num)) System.out.println(map.get(num));
            else System.out.println(0);
        }
    }
}
