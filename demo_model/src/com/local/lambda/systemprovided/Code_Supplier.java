package com.local.lambda.systemprovided;

import java.util.function.Supplier;
//Supplier代表一个输出
public class Code_Supplier {
    public static void main(String[] args) {
        Supplier<String> s1=new Supplier<String>() {
            @Override
            public String get() {
                return "hello world";
            }
        };
        System.out.println(s1.get());


    }

}
