package String_dsa;
import java.util.*;
public class starting_and_ending_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c =0;
        for(int i=0;i<a.length();i++){
            for(int j=i;j<a.length();j++){
                String sub = a.substring(i,j+1);
                if(sub.charAt(0)=='1' && sub.charAt(sub.length()-1)=='1'){
                  c++;
                }
            }
        }
        System.out.println(c);

    }
}
