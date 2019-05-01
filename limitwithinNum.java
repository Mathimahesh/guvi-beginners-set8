import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int c = 0;
        for(int i=m;i<=n;i++){
            if(i==x) c++;
        }
        if(c==1)System.out.println("yes");
            else System.out.println("no");
        
    }
}
