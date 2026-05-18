package com.pra;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter you distace you want to convert into miles : ");
        float km= in.nextFloat();
        if (km<0){
            System.out.println("plese Go with your footStep, Because you r too close ");
            return;
        }

        double miles= km*0.6213712;
        System.out.println(miles);


    }
}
