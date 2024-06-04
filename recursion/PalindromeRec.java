import java.util.Arrays;
import java.util.Scanner;

/**
 * PalindromeRec
 */
public class PalindromeRec {

    public static boolean fun(int[] arr,int l,int n){
        if(l>=arr.length/2) return true;
        if(arr[l]!=arr[arr.length-l-1]) return false;
        return fun(arr,l+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        boolean isPanldrome=fun(arr, 0, n);
        if (isPanldrome) {
            System.out.println("yes");
        }else System.out.println("NO");


    }
}