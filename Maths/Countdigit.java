package Maths;


import java.util.*;

public class Countdigit {
    public static int count(long n){
        int count = (int)Math.log10(Math.abs(n))+1;   //secound approach
        // while(n>0){
        //     int lc=n%10;
        //     count+=1;
        //     n=n/10;
        // }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n=sc.nextLong();
        int result =count (n);
        System.out.println(result);
    }
}