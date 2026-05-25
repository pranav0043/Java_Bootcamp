package com.Pranav;
import java.util.ArrayList;
public class A_list {
    public static void main(String[] args) {
        ArrayList<String> MCA =new ArrayList<>();
        MCA.add("JAVA");
        MCA.add("DSA");
        MCA.add("Data Analysis");
        MCA.add("Database");
        MCA.add(0,"100 DAYS of code");
        MCA.set(3,"Fortuner");
        for (int i = 0; i < MCA.size(); i++) {
            System.out.println(MCA.get(i));
        }
        System.out.print(MCA);
    }
}
