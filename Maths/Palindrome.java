package Maths;

import java.util.*;

public class Palindrome {

    public static boolean palin(int n) {
        int pal=n;
        int rev=0;
		while(n>0){
			int ld = n%10;
			rev=(rev*10)+ld;
			n/=10;
		}
        return pal==rev;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        boolean result = palin(n);
        System.out.println(result);

    }
}