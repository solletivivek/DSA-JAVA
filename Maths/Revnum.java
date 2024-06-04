package Maths;

import java.util.*;

public class Revnum{
    public static int rev(int n){
        int rev=0;
		while(n>0){
			int ld = n%10;
			rev=(rev*10)+ld;
			n/=10;
		}
		return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int result=rev(n);
        System.out.println(result);
    }
}