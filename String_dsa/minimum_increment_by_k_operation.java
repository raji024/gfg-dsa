package String_dsa;
import java.util.*;
public class minimum_increment_by_k_operation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<x;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int sum =0;
        int s = sc.nextInt();
        boolean isfound = false;
        for(int i=0;i<x;i++){
            if(max-arr[i]%s!=0){
                isfound =true;
            }else{
                sum = sum + max-arr[i]/s;
            }
        }
        System.out.println(sum);

    }
}
