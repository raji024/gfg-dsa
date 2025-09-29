package String_dsa;
import java.util.*;
public class rotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = a+a;
        if(c.contains(b)){
            System.out.println("true");
        }else{
            System.out.println("No");
        }
    }
}
