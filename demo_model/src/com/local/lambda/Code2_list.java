package com.local.lambda;


import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Code2_list {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java", "javascript", "scala", "python");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (String str:list){
            System.out.println(str);

        }

        System.out.println("==================================");

        //Lambda
        Collections.sort(list,(a,b)->a.length()-b.length());
        PrintStream var10001 = System.out;
        list.forEach(var10001::println);
    }
}
