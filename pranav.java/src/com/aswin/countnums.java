package com.aswin;

public class countnums {
    public static void main(String[] args) {
        int n =12345, reversed=0 ;
//        int count=0;
        while(n>0){
            int rem =n%10;
            reversed=reversed*10+rem;
            n=n/10;
        }
        System.out.println(reversed);
    }
}
