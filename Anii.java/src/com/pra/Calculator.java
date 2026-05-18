package com.pra;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter you Marks of Maths: ");
        int math=in.nextInt();
        System.out.print("Enter you Marks of Science: ");
        int Sci=in.nextInt();
        System.out.print("Enter you Marks of Hindi: ");
        int Hin= in.nextInt();
        System.out.print("Enter you Marks of English: ");
        int Eng= in.nextInt();
        System.out.print("Enter you Marks of Sanskrit: ");
        int San= in.nextInt();
        if (math>100 || math<0|| Sci>100 || Sci<0|| Hin>100 || Hin<0|| Eng>100 || Eng<0|| San>100 || San<0){
            System.out.println("your makrs is invalid");
            return;
        }


        int sum =math+Sci+Hin+Eng+San;
        double per= ( (double) sum / 500) * 100;
        System.out.println("Your total marks is : "+sum);
        System.out.print("Your Overall Percentage  is : "+ per);

//        char op =in.next().trim().charAt(0);
//        if(op=='+'|| op =='-' || op=='*' ||op== '/'|| op =='%



    }
}
