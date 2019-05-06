import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        double val = Math.sqrt(c);
        if(val-(Math.floor(val))==0) System.out.println("yes");
        else System.out.println("no");
        
    }
}
