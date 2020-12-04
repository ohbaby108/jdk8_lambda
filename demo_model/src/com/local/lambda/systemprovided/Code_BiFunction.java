package com.local.lambda.systemprovided;

import java.util.function.BiFunction;

//BiFunction 代表两个输入,一个输出(一般输入和输出是不同类型)
public class Code_BiFunction {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> b1=new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length()+s2.length();
            }
        };
       int strLength= b1.apply("hello world","bifunction");
        System.out.println(strLength);



    }
}
