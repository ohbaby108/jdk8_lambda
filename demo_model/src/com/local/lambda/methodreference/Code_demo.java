package com.local.lambda.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;

public class Code_demo {
    public static void main(String[] args) {
        Function<String,Integer> s1=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(s1.apply("abc"));

        Consumer<String> c=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        c.accept("str");

    }
}
