package Usefull;

import java.util.Scanner;

/**
 * Testing
 */
public class p2 {

    public static long sumLtoR(Long l,Long r){
        long sum=0;
        if(l<r){
            for(long i=l;i<=r;i++){
                sum+=i;
            }
        }
        return sum;
    }
    public static long sumLtor2(Long l , Long r)
    {
        long s1=(l*(l-1)/2);
        long s2=(r*(r+1)/2);
        long sum2=(s1-s2);
        return sum2;
    }  


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        // long sum=sumLtoR(l,r);
        long sum=sumLtor2(l,r);
        System.out.println(sum);
    }
}