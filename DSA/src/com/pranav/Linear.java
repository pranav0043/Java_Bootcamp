package com.pranav;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num = {23, 45, 63, 12, 11, 34, 55, 90};
        System.out.println("Enter your Target number:");
        int target =in.nextInt();
        int ans = linearSearch(num, target,1,3);
        System.out.println(ans);

    }

    //Search in  the array
    static int linearSearch(int[] arr, int target ,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <=end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}





