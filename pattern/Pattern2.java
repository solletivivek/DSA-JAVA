/**
 * Pattern2
 */
import java.util.*;
public class Pattern2 {
    public static void patter2(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        patter2(n);
    }
    
}