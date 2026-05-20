package com.pra;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a=100;
            System.out.println(a);
            int c=120;
            System.out.println(c);
        }
        int c=908;
        System.out.println(a);
        System.out.println(c);
    }


//        System. out. println ();
//
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        }
    }

