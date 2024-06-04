import java.util.Scanner;

/**
 * Pattern6
 */
public class Pattern6 {
    public static void p6(int n){
        for(int i=0;i<n;i++){
            for(int j =1;j<=n-i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        p6(n);
    }
 
    
}

//output
// 6
// 12345
// 1234
// 123
// 12
// 1