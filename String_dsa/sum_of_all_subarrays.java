package String_dsa;
import java.util.*;
public class sum_of_all_subarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int max =0;
        for(int i=0;i<x;i++){
            int sum =0;
            for(int j=i;j<x;j++){
                sum+=arr[j];
                max = max+sum;
            }
            
        }
        System.out.println(max);
    }
}
