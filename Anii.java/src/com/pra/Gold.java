package com.pra;
import java.util.*;
public class Gold {
    public static void main(String[] args) {
//        int rollNo= 64;
//        char letter ='p';
//        float marks=99.98f;
//        double largeDecimalNumber=90866363.9098;
//        long largeInteger = 346783565;
//        boolean check = false;

        Scanner input = new Scanner(System.in);
        System.out.print("enter your roll no  :");
        int rollNo = input.nextInt();
        System.out.print("enter your letter no : ");
        String letter= input.next();
        System.out.println("enter your marks ");
        float marks= input.nextFloat();
        System.out.println("enter your decimal value ");
        double largeDecimal= input.nextDouble();
        System.out.println("enter correction");
        boolean check = input.nextBoolean();
        System.out.println("my Roll no is : "+rollNo);
        System.out.println("my first letter of name is :"+letter);
        System.out.println("my marks  is :"+marks);
        System.out.println("my height in mm is :"+largeDecimal);
        System.out.println("my first  name is :"+check);

//        System.out.println("Hello pranav start your new journey of 21 day java ");
//        System.out.print("Get ready for next Tutorial");
    }
}
