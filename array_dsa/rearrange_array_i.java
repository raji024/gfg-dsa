package array_dsa;
import java.util.*;
public class rearrange_array_i {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = new int[x];
        for(int i=0;i<x;i++){
            res[i] =-1;
            for(int j=i+1;j<x+i;j++){
                int index = j%x;
                if(i == arr[index]){
                    res[i] = arr[index];
                }
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(res[i]+" ");
        }
    }
}
