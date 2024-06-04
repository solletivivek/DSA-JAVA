package Hashing;

import java.util.Scanner;

/**
 * Count
 */
public class Count {

    public static int[] hash;

    public static void fun(int arr[],int n){
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        hash = new int[size];

        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        fun(arr, n);

        int q = sc.nextInt();
        while(q--!=0){
            int number=sc.nextInt();
            System.out.println(hash[number]);
        }
        sc.close();
    }

}

// package Hashing;

// import java.util.Scanner;

// public class Count {

//     // Declare hash array at the class level
//     public static int[] hash = new int[13];

//     public static void fun(int[] arr, int n) {
//         for (int i = 0; i < n; i++) {
//             hash[arr[i]] += 1;
//         }
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         fun(arr, n);

//         // Read the number of queries
//         int q = sc.nextInt();
//         for (int i = 0; i < q; i++) {
//             // Read the number for the query
//             int number = sc.nextInt();
//             // Output the frequency of the queried number
//             System.out.println("Frequency of " + number + " is: " + hash[number]);
//         }
        
//         sc.close(); // Close the scanner
//     }
// }
