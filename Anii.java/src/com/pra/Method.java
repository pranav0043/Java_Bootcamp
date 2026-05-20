package com.pra;

import java.util.Scanner;
import java.util.Arrays;
public class Method {
    public static void main(String[] args) {
        int[] arr={1,2,3,56,78};
//        System.out.print(Arrays());
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] num){
        num[4]=10;
    }
}



/*
public class Method {
    static void  SWAP(int a,int b) {
        int temp = a;
        a=b;
        b = temp;

    }

    public static void main(String[] args) {
        SWAP(6,7);


    }


   /* public static int banmanus(int a, int b) {
//        int max = a;
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
//        Scanner.in=new Scanner(System.in);
        System.out.println("Enter two number");
       int result= banmanus(12,10);
        int doubled = result * 2;
        System.out.println(result);
        System.out.println(doubled);

    */
