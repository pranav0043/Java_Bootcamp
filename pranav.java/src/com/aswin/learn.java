package com.aswin;
import java.util.*;
public class learn {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your AGE : ");
        Scanner in = new Scanner(System.in);

        age=in.nextInt();

        if (age<18){
            System.out.println("Sorry! try after a year");
        }
        else if (age<=60 ) {
            System.out.println("congratulation !! your r ready for race");
            
        }
        else {
            System.out.println("u r out of this world try in next ZIndagi");
        }
    }
}

