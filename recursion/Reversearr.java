
import java.util.*;

/**
 * Reversearr
 */
public class Reversearr {


    public static void fun(int arr[],int l,int r){
        if(l>=r) return ;
        swap(arr,l,r);
        fun(arr,l+1,r-1);
    }

    private static void swap(int[] arr,int l, int r){
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    

    public static void fun2(int[] arr,int i,int n){
        if(i>=n/2) return;
        swap(arr,i,n-i-1);
        fun2(arr,i+1,n);

    }

    public static void fun3(int[] arr, int m,int n){
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // fun(arr,0,n-1);
        // fun2(arr,0,n);
        fun3(arr,0,n);
        System.out.println(Arrays.toString(arr));
}
}
