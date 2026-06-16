package com.pranav;
//import java.util.Scanner;
import java.util.Arrays;
public class Fin_min {
    public static void main(String[] args) {
        int[] arr = {15, 18, 21, 3, -7, 28};
        System.out.println(min(arr));

//        Scanner in=new Scanner(System.in);
//        int[]arr= new int[10];
//        System.out.println("Enter your Phone  number ");
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = in.nextInt();
    }

    static int min(int[] arr) {
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < ans) {

                ans = arr[i];
            }
        }
        return ans;
    }
}
