import java.util.*;

/**
 * Patter1
 */
public class Patter1 {

    public static void pattern1(int num){
        for (int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        pattern1(num);
    }
}

// output
// 5
// *****
// *****
// *****
// *****
// *****