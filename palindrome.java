import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        for(int i=str.length()-1;i>=0;i--){
            s = s+str.charAt(i);
        }
        if(str.equals(s)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
