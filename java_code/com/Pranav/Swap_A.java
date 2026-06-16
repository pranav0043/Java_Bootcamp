package com.Pranav;

import java.util.Arrays;

public class Swap_A {
    public static void main(String[] args) {
        int[] arr={1,55,63,90,40,55};
//        swap(arr,1,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index4){
        int temp=arr[index1];
        arr[index1]=arr[index4];
        arr[index4]=temp;

    }
}
