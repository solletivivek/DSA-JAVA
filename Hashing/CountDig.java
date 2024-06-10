package Hashing;

import java.util.Scanner;

/**
 * CountDig
 */
public class CountDig {

    static int[] hash =new int[26];
    public static void fun(char c, String str){
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        fun(' ',str);
        int q = sc.nextInt();
        while(q--!=0){
            int c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}




























// package Hashing;

// import java.util.Scanner;

// /**
//  * CountDig
//  */
// public class CountDig {
    
//     static int [] hash = new int[26];
//     public static void fun(char c, String str){
//         for(int i=0;i<str.length();i++){
//             hash[str.charAt(i)-'a']++;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         fun(' ', str);
//         int q=sc.nextInt();
//         while(q--!=0){
//             char c =sc.next().charAt(0);
//             System.out.println(hash[c-'a']);
//         }

//     }
// }