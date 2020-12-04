package com.local.lambda.systemprovided;

import java.util.function.UnaryOperator;

//UnaryOperator代表一个输入一个输出(一般输入和输出是相同类型的)
public class Code_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> u1=new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };
        String str=u1.apply("hello world UnaryOperator");
        System.out.println(str);
    }
}
