package com.pra;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your roll no");
        String roll= in.next();

        switch (roll) {
            case "10" -> System.out.println("Very good boy");
            case "11" -> System.out.println("pta nhi Kon hai");
            case "12" -> System.out.println(" you have tight DIKKI");
            case "13" -> System.out.println("mai nhi aata class");
            case "14" -> System.out.println("Devloper are on 4th bench");
        }








//        int n= in.nextInt();
//        int index =1;
//        int previous =0;
//        int count =2;
//        while (count<=n){
//            int temp=index;
//            index=index+ previous;
//            previous=temp;
//            count++;
//        }
//        System.out.println(index);

    }
}
