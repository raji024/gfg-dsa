package String_dsa;
import java.util.*;
public class camel_case {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        String b[] = a.split(" ");
        for(int i=0;i<b.length;i++){
            String c =b[i];
            String d="";
            for(int j=0;j<c.length();j++){
                char ch= c.charAt(j);
                if(j==0 &&ch>='a' && ch<='z'){
                    ch = (char)(ch-32);
                    d+=ch;

                }else{
                    d+=ch;
                }
            }
            rev.append(d);

        }
        System.out.println(rev.toString());
    }
}
