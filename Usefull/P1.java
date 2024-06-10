package Usefull;

import java.util.*;

/**
 * P1  this code is about converting integer to binary
 */
public class P1 {

    public static int[] fun1(int[] bin,int num,int index){  //approach 1
        while(num>0){
            bin[index]=num%2;
            num/=2;
            index++;
        }
       return bin;
    }

    public static Stack<Integer> fun2(int num){ //approach 2
        Stack<Integer>st=new Stack<>();
        while(num>0){
            st.push(num%2);
            num/=2;
        }
        return st;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] bin=new int[32];
        int n = sc.nextInt();
        int index=0;
        int num=n;

        bin=fun1(bin, num, index);
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(bin[i]);
            }
            System.out.println();

            Stack<Integer> st =fun2(num);
            while (!st.isEmpty()) {
                System.out.print(st.pop());
        }
    }
}
