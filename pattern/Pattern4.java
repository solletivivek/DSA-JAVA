/**
 * Pattern4
 */
import java.util.*;
public class Pattern4 {
    public static void p4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        p4(n);
    }
}

//output
// 5

// 1
// 22
// 333
// 4444