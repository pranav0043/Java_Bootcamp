package com.pra;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int pre=0;
        int cui=1;
        int count =2;
        while(count<=n){
            int temp=cui;
            cui=cui+pre;
            pre=temp;

            count++;

        }
        System.out.println(cui);

    }
}
