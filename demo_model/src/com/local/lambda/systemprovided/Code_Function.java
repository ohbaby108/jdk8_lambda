package com.local.lambda.systemprovided;

import java.util.function.Function;

public class Code_Function {
    public static void main(String[] args) {

        //翻译: 给定一个String 类型的字符串 返回一个int类型的字符串的长度
        Function<String,Integer> f1=(str)->{return str.length();};
        int length=f1.apply("abcdefghijklmn");
        System.out.println(length);


    }

}
