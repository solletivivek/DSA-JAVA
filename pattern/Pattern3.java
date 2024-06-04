/**
 * Pattern3
 */
import java.util.*;
public class Pattern3 {
    public static void p3(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        p3(n);
    }
    
}

// output
// 5
// *
// **
// ***
// ****
// *****