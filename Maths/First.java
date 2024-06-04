package Maths;

import java.util.*;

class First {

    static void sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }


    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        for (int ele : arr) {
            arr[i++] = sc.nextInt();
        }
        sum(arr);
    }
}
