package String_dsa;
import java.util.*;
public class replace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder b = new StringBuilder();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch==' '){
                b.append("%20");
            }else{
                b.append(ch);
            }
        }
        System.out.println(b.toString());

    }
}
