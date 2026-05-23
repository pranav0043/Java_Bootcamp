package com.Pranav;

import java.util.Arrays;


public class arrays {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int[] Arr ={1,2,4,6,8};
        System.out.println(" your Entered  Data is :"+(Arrays.toString(Arr)));
        change(Arr);
        System.out.print("changed Data is :");
        System.out.println(Arrays.toString(Arr));

        }
        static void change(int[] str) {
             str[0]=10;
             str[4]=80;
        }



    }

