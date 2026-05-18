package com.pra;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Marks of Maths: ");
        int math = in.nextInt();
        System.out.print("Enter you Marks of Science: ");
        int Sci = in.nextInt();
        System.out.print("Enter you Marks of Hindi: ");
        int Hin = in.nextInt();
        //validation
        if (math > 100 || math < 0 || Sci > 100 || Sci < 0 || Hin > 100 || Hin < 0) {
            System.out.println("your marks is invalid");
            return;
        }
        int sum=math+Sci+Hin;

        float CGPA = (float) sum /30;
        System.out.println("your result is "+ CGPA +"CGPA");

    }
}
