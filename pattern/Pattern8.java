import java.util.Scanner;

/**
 * Pattern8
 */
public class Pattern8 {

    public static void p8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n-(2 * i +1 ); j++) {
                System.out.print("*");
            }

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p8(n);
    }
}

// output
//5
// *********
//  *******
//   *****
//    ***
//     *