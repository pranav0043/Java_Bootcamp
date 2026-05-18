package com.aswin;
import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("First 50 odd numbers:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
//                System.out.print(i + " ");
//                 for (int i = 2; i <= 50; i +=2) {
                    System.out.print(i + " ");
                }
            }
        }
}