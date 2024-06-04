package Maths;

import java.util.*;

public class Amstrong {

    public static boolean amstrong(int n){
        int dup=n;
        int sum =0;
        while(n>0){
            int ld = n%10;
            sum = sum+(ld*ld*ld);
            n=n/10;
        }
        return dup==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result=amstrong(n);
        System.out.println(result);
    }
}