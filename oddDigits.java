import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        String value = "";
        while(n>0){
            r = n%10;
            n = n/10;
            if(r%2!=0){
                value +=Integer.toString(r);
            }
        }
        for(int i=value.length()-1;i>=0;i--){
            System.out.print(value.charAt(i)+" ");
        }
    }
}
