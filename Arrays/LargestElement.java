
import java.util.*;
import java.lang.*;


/**
 * LargestElement
 */
public class LargestElement {

    public static int ele(int arr[]){               // brute force
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int rec(int arr[]){               //recursive approach ( optimal approch )
        int max=arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        // System.out.println(ele(arr));
        System.out.println(rec(arr));
    
    
    }
}

// output
// 5
// 1 2 3 4 5 
// 5