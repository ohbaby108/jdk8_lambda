package com.local.lambda.systemprovided;

import java.util.function.BinaryOperator;

public class Code_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> b1=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer*integer2;
            }
        };
        int result=b1.apply(100,200);
        System.out.println(result);
    }
}
