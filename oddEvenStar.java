import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char ch[] = str.toCharArray();
        if(len%2!=0){
             int mid = str.length()/2;
            ch[mid] = '*';
        }
        else{
            int mid = str.length()/2;
             ch[mid] = '*';
             ch[mid-1] = '*';
        }
        for(int i=0;i<len;i++){
            System.out.print(ch[i]);
        }
    }
}
