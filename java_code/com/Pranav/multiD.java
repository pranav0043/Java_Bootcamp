package com.Pranav;
import java.util.Scanner;
import java.util.Arrays;
public class multiD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] arr = new String[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.next();
            }
        }
        for(String[] Rah: arr){
            System.out.println(Arrays.toString(Rah));
//        //output
//        for (String[] Pr : arr) {
//            //for each col in ever row
//            for (String anInt : pr) {
//                System.out.print(anInt + " ");}
        }
    }
}
